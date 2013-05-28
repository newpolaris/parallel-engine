package prl.logic.manager;

import java.util.List;
import java.util.LinkedList;

import prl.annotation.AbstractLogic;
import prl.injectable.SceneManagerInjectable;
import prl.interf.managable.SceneManagable;
import prl.interf.managable.communication.PhysicsManagerToSceneManagerInterface;
import prl.interf.managable.communication.SceneManagerToDiskManagerInterface;
import prl.interf.managable.communication.SceneManagerToRenderingManagerInterface;
import prl.interf.managable.communication.ScriptManagerToSceneManagerInterface;

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
	@AbstractLogic
	public void afterDoFrame() {
		List<String> requestedSceneNames = this.requestedSceneNames;
		this.requestedSceneNames = new LinkedList<String>();
		for( String sceneName : requestedSceneNames )
		{
			diskManager.loadScene( sceneName );
			currentSceneNames.add( sceneName );
		}
	}

	@Override
	public void doFrame() {
	}

	@Override
	public Boolean isExitRequested() {
		return false;
	}

	public List<String> currentSceneNames = new LinkedList<String>();
	public List<String> requestedSceneNames = new LinkedList<String>();

	@Override
	public void appendScene(String sceneName) {
		requestedSceneNames.add(sceneName);
	}
}
