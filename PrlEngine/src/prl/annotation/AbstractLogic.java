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
 * Unfortunately there is no way to force this limitation within Java native functionality.
 * This will have to be forced by external Java language parser.
 * The plan is that the parser will be generated from ANTLR.
 * 
 * @author wrice127
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface AbstractLogic {

}
