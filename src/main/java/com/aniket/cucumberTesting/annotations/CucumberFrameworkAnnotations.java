/**
 * 
 */
package com.aniket.cucumberTesting.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.aniket.cucumberTesting.enums.CategoryTypes;



/**
 * 06-Dec-2021 
 * @author ANIKET
 * @version 1.0
 */

@Retention(RUNTIME)
@Target(METHOD)
@Documented
public @interface CucumberFrameworkAnnotations {
	/**
	 * 
	 * @return Array of String author from the annotations used in the
	 *         {@link com.testingframework.test} packages.
	 */
	public String[] author() default "";

	/**
	 * 
	 * @return Array of Category Types from the annotations used in the
	 *         {@link com.testingframework.test} packages.
	 * 
	 *         <p>
	 *         Category types can be SANITY, REGRESSION, MINIREGRESSION,
	 *         SMOKE,...etc. as defined in the {@link com.testingframework.enums}
	 *         package.
	 *         </p>
	 * 
	 */
	public CategoryTypes[] category();
}
