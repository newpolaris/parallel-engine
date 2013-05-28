package prl.interf.managable;

public interface Managable {

	/**
	 * startManager and stopManager are for managers that doesn't rely on
	 * FramePumpLogic. They will have to manager synchronization and thread
	 * scheduling by themselves.
	 * */
	void startManager();

	void stopManager();

	/**
	 * some managers may nor may not need to do something every frame. If this
	 * returns false, beforeDoFrame(), afterDoFrame(), doFrame() and
	 * isExitRequested() wouldn't be called from the FramePumpLogic.
	 */
	boolean needToDoEveryFrame();

	/** beforeDoFrame and afterDoFrame is mainly for synchronization. */
	void beforeDoFrame();

	/** beforeDoFrame and afterDoFrame is mainly for synchronization. */
	void afterDoFrame();

	/** main loop until isExitResuested() returns true */
	void doFrame();

	/** returns true when we when to exit the whole program */
	Boolean isExitRequested();
}
