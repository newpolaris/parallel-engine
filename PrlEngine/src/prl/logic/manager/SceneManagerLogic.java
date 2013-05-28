package prl.logic.manager;

import prl.injectable.SceneManagerInjectable;
import prl.interf.managable.PhysicsManagable;
import prl.interf.managable.RenderingManagable;
import prl.interf.managable.SceneManagable;

public class SceneManagerLogic implements SceneManagable {

	public SceneManagerInjectable sceneManagerInj;
	public RenderingManagable renderingManager;
	public PhysicsManagable physicsManager;

	public SceneManagerLogic( SceneManagerInjectable sceneManagerInj, RenderingManagable renderingManager, PhysicsManagable physicsManager )
	{
		this.sceneManagerInj = sceneManagerInj;
		this.renderingManager = renderingManager;
		this.physicsManager = physicsManager;
	}
	
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
		// SceneManager will need to handle animation every frame.
		return true;
	}

	@Override
	public void beforeDoFrame() {
		physicsManager.waitForSimulationFromPreviousFrame();
		physicsManager.startSimulationForNextFrame();
	}

	@Override
	public void afterDoFrame() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFrame() {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean isExitRequested() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setScene(String string) {
		// TODO Auto-generated method stub

	}

}
