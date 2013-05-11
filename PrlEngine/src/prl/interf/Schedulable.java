package prl.interf;

import java.util.List;

import prl.interf.functional.Doable;
import prl.interf.functional.Retreivable;

public interface Schedulable {

	public <E> void forEach(List<E> managers, Doable<E> functor );

	public <E> List<E> filter(List<E> managers, Retreivable<E, Boolean> functor );

}
