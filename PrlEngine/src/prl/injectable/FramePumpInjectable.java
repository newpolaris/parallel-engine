package prl.injectable;

public interface FramePumpInjectable {

	void beforeFirstFrame();
	void afterLastFrame();
	
	boolean isExitRequested();

	void beforeEachFrame();
	void afterEachFrame();

	void doFrame();

}
