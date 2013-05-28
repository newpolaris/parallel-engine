package prl.logic.manager;

import prl.injectable.PhysicsManagerInjectable;
import prl.interf.managable.PhysicsManagable;

public class PhysicsManagerLogic implements PhysicsManagable {

	public PhysicsManagerInjectable physicsInj;
	
	@Override
	public void startManager() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stopManager() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean needToDoEveryFrame() {
		return true;
	}

	@Override
	public void beforeDoFrame() {
		physicsInj.waitForSimulationFromPreviousFrame();
		physicsInj.startSimulationForNextFrame();
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
