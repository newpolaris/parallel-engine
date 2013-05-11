package prl.injectable;

import java.util.List;

import prl.interf.Managable;

public interface ManagersInjectable {

	void beforeStartManagers();

	List< Managable > getManagers();

	void afterStartManagers();

	void afterStopManagers();

	void beforeStopManagers();

}
