package prl.interf.managable;

public interface PhysicsManagable extends Managable {

	void waitForSimulationFromPreviousFrame();

	void startSimulationForNextFrame();

}
