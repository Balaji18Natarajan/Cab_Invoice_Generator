/**
 * 
 */
package com.wipro.userexceptions;
import java.lang.Exception;

/**
 * @author Balaji Natarajan
 *
 */
public class NegativeKilometerException extends Exception {

	@Override
	public String toString() {
		return "Invalid KM";
	}
	
	
}
