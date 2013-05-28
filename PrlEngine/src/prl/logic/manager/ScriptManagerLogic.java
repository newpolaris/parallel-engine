package prl.logic.manager;

import prl.annotation.AbstractLogic;
import prl.injectable.ScriptManagerInjectable;
import prl.interf.Schedulable;
import prl.interf.managable.SceneManagable;
import prl.interf.managable.ScriptManagable;

public class ScriptManagerLogic implements ScriptManagable {

	public ScriptManagerInjectable scriptInj;
	public SceneManagable sceneManager;
	public Schedulable scheduler;

	public ScriptManagerLogic(ScriptManagerInjectable scriptInj, Schedulable scheduler, SceneManagable sceneManager) {
		this.scriptInj = scriptInj;
		this.sceneManager = sceneManager;
		this.scheduler = scheduler;
	}

	@Override
	@AbstractLogic
	public void startManager() {
		scriptInj.bootScript();
		this.sceneManager.appendScene( this.scriptInj.getBootSceneName() );
	}

	@Override
	@AbstractLogic
	public void stopManager() {
		scriptInj.shutdownScript();
	}

	@Override
	public boolean needToDoEveryFrame() {
		return true;
	}

	@Override
	public void beforeDoFrame() {
		// we may want to load script dynamically at run-time
	}

	@Override
	public void afterDoFrame() {
	}

	@Override
	@AbstractLogic
	public void doFrame() {
		scriptInj.tick();
	}

	@Override
	@AbstractLogic
	public Boolean isExitRequested() {
		return scriptInj.isExitRequested();
	}

}
