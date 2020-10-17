package project3;

import java.lang.RuntimeException;

/**
 * Display all components of 24-point game. The components are a refresh button, a panel with four labels with card 
 * image icons, a text field for an expression, and a verify button.
 * @author Naganobu Masuda
 * @version 1.0
 */

public class StackException extends RuntimeException {
	/**
	 * Constructs an exception with a specified message. 
	 * @param message The specified message of this exception
	 */
	public StackException(String message) {
		super(message);
	}

}