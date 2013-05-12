package prl.injectable;

public interface ScriptManagerInjectable {

	void bootScript();

	void shutdownScript();

	void tick();

	boolean isExitRequested();

}
