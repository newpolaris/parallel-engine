package prl.logic.manager;

import prl.annotation.AbstractLogic;
import prl.interf.managable.DiskManagable;

public class DiskManagerLogic implements DiskManagable {

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
		return false;
	}

}
