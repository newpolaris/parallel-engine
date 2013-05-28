package prl.logic.manager;

import java.util.List;

import prl.annotation.AbstractLogic;
import prl.injectable.SceneManagerInjectable;
import prl.interf.managable.PhysicsManagable;
import prl.interf.managable.RenderingManagable;
import prl.interf.managable.SceneManagable;

public class SceneManagerLogic implements SceneManagable {

	public SceneManagerInjectable sceneInj;
	public RenderingManagable renderingManager;
	public PhysicsManagable physicsManager;
	public List<String> currentSceneNames;
	public List<String> requestedSceneNames;

	public SceneManagerLogic(SceneManagerInjectable sceneManagerInj,
			RenderingManagable renderingManager, PhysicsManagable physicsManager) {
		this.sceneInj = sceneManagerInj;
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
	@AbstractLogic
	public void beforeDoFrame() {
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
		// probably scene manager wouldn't need to request exit but it is still
		// possible.
		return false;
	}

	@Override
	public void appendScene(String string) {
		// TODO Auto-generated method stub

	}

}
