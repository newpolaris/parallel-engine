package prl.logic.manager;

import prl.annotation.AbstractLogic;
import prl.interf.managable.DiskManagable;
import prl.interf.managable.SceneManagerToDiskManagerInterface;

public class DiskManagerLogic implements DiskManagable, SceneManagerToDiskManagerInterface {

	@Override @AbstractLogic
	public void startManager() {
		// TODO initialize Collada loader
	}

	@Override @AbstractLogic
	public void stopManager() {
	}

	@Override @AbstractLogic
	public boolean needToDoEveryFrame() {
		return false;
	}

	@Override
	public void beforeDoFrame() {
	}

	@Override
	public void doFrame() {
	}

	@Override
	public void afterDoFrame() {
	}

	@Override
	public Boolean isExitRequested() {
		return false;
	}

}
