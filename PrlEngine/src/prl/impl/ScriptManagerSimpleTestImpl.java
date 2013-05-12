package prl.impl;

import java.util.List;

import prl.injectable.ScriptManagerInjectable;
import prl.interf.AssetManagable;
import prl.interf.Schedulable;
import prl.interf.asset.Audible;
import prl.interf.asset.Renderable;

public class ScriptManagerSimpleTestImpl implements ScriptManagerInjectable {

	public Schedulable schedular;
	public AssetManagable assetManager;
	public List< Renderable > renderables;
	public List< Audible > audibles;
	
	public ScriptManagerSimpleTestImpl( Schedulable schedular )
	{
		this.schedular = schedular;
	}
	
	@Override
	public void bootScript() {
		loadLevel();
		spawnPlayer();
	}

	private void loadLevel() {
		renderables = assetManager.getRenderables();
		audibles = assetManager.getAudibles();
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
