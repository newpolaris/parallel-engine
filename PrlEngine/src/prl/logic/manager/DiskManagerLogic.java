package prl.logic.manager;

import prl.annotation.AbstractLogic;
import prl.interf.Managable;

public class DiskManagerLogic implements Managable {

	@Override @AbstractLogic
	public void startManager() {
		// TODO Auto-generated method stub

	}

	@Override @AbstractLogic
	public void stopManager() {
		// TODO Auto-generated method stub

	}

	@Override @AbstractLogic
	public boolean needToDoEveryFrame() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void beforeDoFrame() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFrame() {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterDoFrame() {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean isExitRequested() {
		// TODO Auto-generated method stub
		return null;
	}

}
