package prl.impl;

import java.util.List;

import prl.injectable.ScriptManagerInjectable;
import prl.interf.AssetManagable;
import prl.interf.Renderable;
import prl.interf.Schedulable;
import prl.interf.asset.SoundAsset;
import prl.interf.game.GameLevel;
import prl.interf.game.GameWorld;

public class ScriptManagerSimpleTestImpl implements ScriptManagerInjectable {

	public AssetManagable assetManager;
	public Schedulable schedular;
	
	public GameWorld gameWorld;
	public List< GameLevel > gameLevels;
	
	public ScriptManagerSimpleTestImpl( AssetManagable assetManager, Schedulable schedular )
	{
		this.assetManager = assetManager;
		this.schedular = schedular;
		this.gameWorld = new SimpleTestGameWorld();
	}
	
	@Override
	public void bootScript() {
		this.spawnBootLevel();
		this.spawnBootObjects();
	}

	private void spawnBootLevel() {
		assetManager.getLevelList();
		return assetManager.loadLevel();
	}

	private void spawnBootObjects() {
		this.spawnCamera();
		this.spawnPlayer();
	}

	private void spawnCamera() {
		// TODO Auto-generated method stub
		
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
