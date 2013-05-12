package prl.interf;

public interface Managable {

	void startManager();

	void stopManager();

	boolean needToDoEveryFrame();

	void beforeDoFrame();
	
	void afterDoFrame();

	void doFrame();
	
	Boolean isExitRequested();
}
