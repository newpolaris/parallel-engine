package prl.interf;

import java.util.List;

import prl.interf.functional.Doable;
import prl.interf.functional.Retreivable;

public interface Schedulable {

	// each loop can run in parallel
	public <E> void forEach(List<E> managers, Doable<E> functor );

	// collect elements that meet certain conditions
	// each functor can run in parallel
	public <E> List<E> filter(List<E> managers, Retreivable<E, Boolean> functor );

}
