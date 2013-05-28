package prl.logic.manager;

import prl.injectable.RenderingManagerInjectable;
import prl.interf.managable.RenderingManagable;

public class RenderingManagerLogic implements RenderingManagable {

	public RenderingManagerInjectable renderingInj;

	public RenderingManagerLogic( RenderingManagerInjectable renderingInj )
	{
		this.renderingInj = renderingInj;
		
	}
	
	@Override
	public void startManager() {
		this.setBufferingCount( renderingInj.getBufferingCount() );
	}

	private void setBufferingCount(Object bufferingCount) {
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
		// TODO Auto-generated method stub

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
