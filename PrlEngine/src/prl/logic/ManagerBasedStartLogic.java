package prl.logic;

import java.util.List;

import prl.annotation.AbstractLogic;
import prl.injectable.FramePumpInjectable;
import prl.injectable.ManagersInjectable;
import prl.interf.Schedulable;
import prl.interf.functional.Doable;
import prl.interf.functional.Retreivable;
import prl.interf.managable.Managable;

public class ManagerBasedStartLogic implements FramePumpInjectable {

	// Input objects
	private ManagersInjectable managersInj;
	private Schedulable scheduler;

	// Special managers
	private List< Managable > managers;
	private List< Managable > managersDoEveryFrame;

	public ManagerBasedStartLogic(
			ManagersInjectable managersObj,
			Schedulable scheduler ) 	{
		this.managersInj = managersObj;
		this.scheduler = scheduler;
	}

	@Override @AbstractLogic
	public void beforeFirstFrame() {
		this.managers = managersInj.getManagers();
		managersInj.beforeStartManagers();
		scheduler.forEach( managers, m -> m.startManager() );
		managersInj.afterStartManagers();
		managersDoEveryFrame = scheduler.filter( managers, m -> m.needToDoEveryFrame() );
	}

	@Override @AbstractLogic
	public void afterLastFrame() {
		managersInj.beforeStopManagers();
		scheduler.forEach( managers, m -> m.stopManager() );
		managersInj.afterStopManagers();
	}

	@Override @AbstractLogic
	public boolean isExitRequested() {
		return scheduler.filter( managersDoEveryFrame, m -> m.isExitRequested() ).size() > 0;
	}

	@Override @AbstractLogic
	public void beforeEachFrame() {
		scheduler.forEach( managersDoEveryFrame, m -> m.beforeDoFrame() );
	}

	@Override @AbstractLogic
	public void afterEachFrame() {
		scheduler.forEach( managersDoEveryFrame, m -> m.afterDoFrame() );
	}

	@Override @AbstractLogic
	public void doFrame() {
		scheduler.forEach( managersDoEveryFrame, m -> m.doFrame() );
	}

}
