package prl.logic.manager;

import prl.annotation.AbstractLogic;
import prl.injectable.ScriptManagerInjectable;
import prl.interf.Schedulable;
import prl.interf.managable.SceneManagable;
import prl.interf.managable.ScriptManagable;
import prl.interf.managable.ScriptManagerToSceneManagerInterface;

public class ScriptManagerLogic implements ScriptManagable {

	public ScriptManagerInjectable scriptInj;
	public Schedulable scheduler;
	public ScriptManagerToSceneManagerInterface sceneManager;

	public ScriptManagerLogic(ScriptManagerInjectable scriptInj,
			Schedulable scheduler,
			ScriptManagerToSceneManagerInterface sceneManager) {
		this.scriptInj = scriptInj;
		this.scheduler = scheduler;
		this.sceneManager = sceneManager;
	}

	@Override
	@AbstractLogic
	public void startManager() {
		scriptInj.bootScript();
		this.sceneManager.appendScene(this.scriptInj.getBootSceneName());
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
