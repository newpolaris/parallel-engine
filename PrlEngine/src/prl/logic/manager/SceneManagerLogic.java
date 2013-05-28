package prl.logic.manager;

import java.util.List;

import prl.annotation.AbstractLogic;
import prl.injectable.SceneManagerInjectable;
import prl.interf.managable.PhysicsManagerToSceneManagerInterface;
import prl.interf.managable.SceneManagable;
import prl.interf.managable.SceneManagerToDiskManagerInterface;
import prl.interf.managable.SceneManagerToRenderingManagerInterface;
import prl.interf.managable.ScriptManagerToSceneManagerInterface;

public class SceneManagerLogic implements SceneManagable,
		ScriptManagerToSceneManagerInterface,
		PhysicsManagerToSceneManagerInterface {

	public SceneManagerInjectable sceneInj;
	public SceneManagerToDiskManagerInterface diskManager;
	public SceneManagerToRenderingManagerInterface renderingManager;

	public SceneManagerLogic(SceneManagerInjectable sceneManagerInj,
			SceneManagerToRenderingManagerInterface renderingManager,
			SceneManagerToDiskManagerInterface diskManager) {
		this.sceneInj = sceneManagerInj;
		this.renderingManager = renderingManager;
		this.diskManager = diskManager;
	}

	@Override
	public void startManager() {
	}

	@Override
	public void stopManager() {
	}

	@Override
	public boolean needToDoEveryFrame() {
		return true; // SceneManager need to handle animation every frame.
	}

	@Override
	@AbstractLogic
	public void beforeDoFrame() {
	}

	@Override
	public void afterDoFrame() {
	}

	@Override
	public void doFrame() {
	}

	@Override
	public Boolean isExitRequested() {
		return false;
	}

	public List<String> currentSceneNames;
	public List<String> requestedSceneNames;

	@Override
	public void appendScene(String sceneName) {
		requestedSceneNames.add(sceneName);
	}
}
