package project3;

import java.util.ArrayList;

/**
 * Display all components of 24-point game. The components are a refresh button, a panel with four labels with card 
 * image icons, a text field for an expression, and a verify button.
 * @author Naganobu Masuda
 * @version 1.0
 */

public class GenericStack<E> implements GenericStackInterface<E>{
	/**
	 * the list of objects of this stack
	 */
	private ArrayList<E> list;
	
	/**
	 * the index of this stack
	 */
	private int top;
	
	/**
	 * constructs an empty stack
	 */
	public GenericStack(){
		this.list = new ArrayList<E>();
		this.top = -1;
	}
	
	/**
	 * returns the number of objects of this stack
	 * @return the number of objects of this stack
	 */
	public int getSize(){
		return this.top + 1;
	}
	
	/**
	 * returns a reference to the top element of this stack
	 * @return a reference to the top element of this stack
	 * @throws StackException if stack is empty
	 */
	public E peek() throws StackException{
		if(!isEmpty()){
			return this.list.get(this.top);
		}else{
			throw new StackException("StackException on " + "peek: stack is empty");
		}
	}
	
	/**
	 * adds an object to the top of this stack
	 * @param an object to be pushed to the stack
	 */
	public void push(E item){
		this.list.add(item);
		this.top++;
	}
	
	/**
	 * removes from the top of this stack
	 * @return from the top of this stack
	 * @throws StackException if stack is empty
	 */
	public E pop() throws StackException{
		if(!isEmpty()){
			E item = this.list.get(this.top);
			this.list.remove(this.top);
			this.top--;
			return item;
		}else{
			throw new StackException("StackException on " + "pop: stack is empty");
		}
	}
	 
	/**
	 * determines whether a list is empty
	 * @return A boolean value specifying if this list is empty or not
	 */
	public boolean isEmpty() {
		return this.top < 0;
	}
}
