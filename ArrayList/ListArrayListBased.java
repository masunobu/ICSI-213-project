package project1;

import java.util.ArrayList;

/**
 * Creates an ADT Bag composed of a list of grocery items and a set of operations on the list.
 * @author Naganobu Masuda
 * @version 1.0
 */

public class ListArrayListBased implements ListInterface {
	
	private ArrayList<Object> list;
	
	/**
	 * constructs a newly created List object
	 */
	public ListArrayListBased(){
		this.list = new ArrayList<Object>();
	}

	/**
	 * adds an item to the end of the list of this bag
	 * @param The name of item
	 */
	public void insert(String item){
		this.list.add(item);
	}
	
	/**
	 * (Optional)
	 * adds an item at the index
	 * @param The index and name of item
	 */
	public void addItem(int index, Object list) throws ListIndexOutOfBoundsException {
		if(index < 0 || index > this.list.size()){
			throw new ListIndexOutOfBoundsException("The index value ust be between 0 and " + this.list.size());
		}
		else{
			this.list.add(index, list);
		}
	}
	
	/**
	 * removes the item at the end of this bag 
	 * @param The index of item
	 */
	public void removeLast(int index) throws ListIndexOutOfBoundsException, ListException {
	    if(this.list.size() == 0){
       	    throw new ListException("The list is empty, and no elements can be removed.");
		}else if(index < 0 || index > this.list.size()){
	        throw new ListIndexOutOfBoundsException("The index value must be between 0 and " + (this.list.size()-1));
		}else{
			this.list.remove(index);
		}
	 }
	
	/**
	 * removes an item at a random index from this bag
	 * @param The index of item
	 */
	public void removeRandom(int index) throws ListIndexOutOfBoundsException, ListException {
		if(this.list.size() == 0){
       	    throw new ListException("The list is empty, and no elements can be removed.");
		}else{
			this.list.remove(index);
		}
	}
	
	/**
	 * returns the index of the first occurrence of an item from this bag
	 * @param The index of item
	 * @return The index of item in the list
	 */
	public Object get(int index) throws ListIndexOutOfBoundsException, ListException {
		if(this.list.size() == 0){
			throw new ListException("The list is empty, and no elements can be removed.");
		}else if(index < 0 || index > this.list.size()){
			throw new ListIndexOutOfBoundsException("The index value must be between 0 and " + (this.list.size()-1));
		}else{
			// return an items at index from this list.
			return this.list.get(index);
		}
	}
	
	/**
	 * returns the size of the list
	 * @return the size of the list
	 */
	public int size() {
		return this.list.size();
	}
	
	/**
	 * returns false if the size of list is 0
	 * @return false if the size of list is 0
	 */
	public boolean isEmpty() {
		return this.list.size() == 0; 
	}
	
	/** 
	 * constructs a newly created List object
	 */
	public void makeEmpty() {
		this.list = new ArrayList<Object>();
	}
	
}