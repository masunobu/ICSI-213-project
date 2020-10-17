package project3;

/**
 * Display all components of 24-point game. The components are a refresh button, a panel with four labels with card 
 * image icons, a text field for an expression, and a verify button.
 * @author Naganobu Masuda
 * @version 1.0
 */


public interface GenericStackInterface<E>{
	
	/**
	 * returns the number of objects of this stack
	 * @return the number of objects of this stack
	 */
    public int getSize();
	
	/**
	 * returns a reference to the top element of this stack
	 * @return a reference to the top element of this stack
	 * @throws StackException if stack is empty
	 */
	public E peek() throws StackException;
	
	/**
	 * adds an object to the top of this stack
	 * @param an object to be pushed to the stack
	 */
	public void push(E item);
	
	/**
	 * removes from the top of this stack
	 * @return from the top of this stack
	 * @throws StackException if stack is empty
	 */
	public E pop() throws StackException;
	
	/**
	 * determines whether a list is empty
	 * @return A boolean value specifying if this list is empty or not
	 */
	public boolean isEmpty();
	
}
