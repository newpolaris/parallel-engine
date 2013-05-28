package prl.logic.manager;

import prl.annotation.AbstractLogic;
import prl.injectable.ScriptManagerInjectable;
import prl.interf.managable.SceneManagable;
import prl.interf.managable.ScriptManagable;

public class ScriptManagerLogic implements ScriptManagable {

	public ScriptManagerInjectable scriptManagerInj;
	public SceneManagable sceneManager;

	public ScriptManagerLogic(ScriptManagerInjectable scriptManagerInj, SceneManagable sceneManager) {
		this.scriptManagerInj = scriptManagerInj;
		this.sceneManager = sceneManager;
	}

	@Override
	@AbstractLogic
	public void startManager() {
		this.sceneManager.setScene( this.scriptManagerInj.getBootSceneName() );
		scriptManagerInj.bootScript();
	}

	@Override
	@AbstractLogic
	public void stopManager() {
		scriptManagerInj.shutdownScript();
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
		scriptManagerInj.tick();
	}

	@Override
	@AbstractLogic
	public Boolean isExitRequested() {
		return scriptManagerInj.isExitRequested();
	}

}
