package prl.logic;

import prl.annotation.AbstractLogic;
import prl.injectable.FramePumpInjectable;

public class FramePumpLogic {

	private FramePumpInjectable framePumpInj;

	public FramePumpLogic( FramePumpInjectable framePumpObj )
	{
		this.framePumpInj = framePumpObj;
	}

	@AbstractLogic
	public void frameLogic()
	{
		framePumpInj.beforeFirstFrame();
		
		while( framePumpInj.isExitRequested() )
		{
			framePumpInj.beforeEachFrame();
			framePumpInj.doFrame();
			framePumpInj.afterEachFrame();
		}
		
		framePumpInj.afterLastFrame();
	}
}
