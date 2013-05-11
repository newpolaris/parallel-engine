package prl.interf;

public interface Managable {

	void stopManager();

	void startManager();

	boolean needToDoEveryFrame();

	void beforeDoFrame();
	
	void doFrame();
	
	void afterDoFrame();

	Boolean isExitRequested();
}
