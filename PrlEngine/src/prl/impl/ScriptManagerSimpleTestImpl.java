package prl.impl;

import java.util.List;

import prl.injectable.ScriptManagerInjectable;
import prl.interf.AssetManagable;
import prl.interf.Renderable;
import prl.interf.Schedulable;
import prl.interf.asset.SoundAsset;
import prl.interf.game.GameLevel;
import prl.interf.game.GameWorld;
import prl.interf.managable.SceneManagable;

public class ScriptManagerSimpleTestImpl implements ScriptManagerInjectable {

	public SceneManagable sceneManager;
	public Schedulable schedular;

	public GameWorld gameWorld;
	public List<GameLevel> gameLevels;

	public ScriptManagerSimpleTestImpl(SceneManagable sceneManager,
			Schedulable schedular) {
		this.sceneManager = sceneManager;
		this.schedular = schedular;
		this.gameWorld = new SimpleTestGameWorld();
	}
	
	@Override
	public String getBootSceneName() {
		return "C:/Users/wrice127/workspace/ParallelEngine/PrlEngine/asset/collada/simpleColladaExample03.dae";
	}

	@Override
	public void bootScript() {
		this.spawnPlayer();
	}

	private void spawnPlayer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void shutdownScript() {
		// TODO Auto-generated method stub

	}

	@Override
	public void tick() {
		processInput();
		schedular.forEach( renderables, r -> r.render() );
		
	}

	private void processInput() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isExitRequested() {
		// TODO Auto-generated method stub
		return false;
	}

}
