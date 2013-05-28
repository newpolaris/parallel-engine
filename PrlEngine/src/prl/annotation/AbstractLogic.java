package prl.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * AbstractLogic methods are methods that does not have local variable or arithmetic calculations.
 * It can have function calls, if-conditional branches or while/for loops.
 * 
 * This is to increase the re-usability/maintainability/readibility of function logic flow.
 * 
 * @author wrice127
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface AbstractLogic {

}
