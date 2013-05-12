package prl.logic.manager;

import prl.annotation.AbstractLogic;
import prl.injectable.ScriptManagerInjectable;
import prl.interf.Managable;

@AbstractLogic
public class ScriptManagerLogic implements Managable {

	ScriptManagerInjectable scriptManagerInj;
	
	public ScriptManagerLogic( ScriptManagerInjectable scriptManagerInj ) {
		this.scriptManagerInj = scriptManagerInj;
	}
	
	@Override @AbstractLogic
	public void startManager() {
		scriptManagerInj.bootScript();
	}

	@Override @AbstractLogic
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

	@Override @AbstractLogic
	public void doFrame() {
		scriptManagerInj.tick();
	}

	@Override @AbstractLogic
	public Boolean isExitRequested() {
		return scriptManagerInj.isExitRequested();
	}

}
