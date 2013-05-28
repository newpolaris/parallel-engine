package prl.injectable;

import prl.interf.managable.RenderingManagable;

public class RenderingManagerInjectable {

	public Object getBufferingCount() {
		return RenderingManagable.TripleBuffering;
	}

}
