/******************************************************************************
* Cody Brock
* CSE 360
* Assignment #2
* https://github.com/codybrock/cse360assign2
* ---
* AddingMachine
* ---
* A simple class that allows the user to add and subtract from a running
* integer total. Starting from zero, the program keeps track of addition
* and subtraction operations and can return the current total as an integer
* or show a complete history of operations used as a formatted string.
******************************************************************************/
package cse360assign2;

/**
 * Object stores an integer total and a history of operations as a String.
 * Contains methods for adding and subtracting integers from the total, as
 * well as returning the total or the history string. Also has a clear method
 * to reset the total and history variables, essentially re-initializing the
 * object.
 */
public class AddingMachine {

	private int total;
	private String history;
	
	public AddingMachine () {
		total = 0;
		history = "0";
	}
	
	/**
	 * Returns the total variable
	 * 
	 * @return		the total variable	
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds a passed value to total
	 * <p>
	 * Also modifies the history variable to reflect the change.
	 * 
	 * @param  value  value to be added to the total
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * Subtracts a passed value from total
	 * <p>
	 * Also modifies the history variable to reflect the change.
	 * 
	 * @param  value  value to be subtracted from total
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * Returns an accounting of how the total has been modified in the form
	 * of a String.
	 * <p>
	 * (ie "1 + 3 - 2 + 4")
	 * 
	 * @return      Operation history in String form
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * Resets the program, returning the total variable to 0 and the
	 * history variable to "0".
	 */
	public void clear() {
		total = 0;
		history = "0";	
	}
}
