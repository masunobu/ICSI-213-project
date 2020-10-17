package project1;

/**
 * Creates an ADT Bag composed of a list of grocery items and a set of operations on the list.
 * @author Naganobu Masuda
 * @version 1.0
 */

public interface ListInterface {
	
	/**
	 * adds an item to the end of the list of this bag
	 * @param The name of item
	 */
	public void insert(String item);
	
	/**
	 * (Optional)
	 * adds an item at the index
	 * @param The index and name of item
	 */
	public void addItem(int index, Object list) throws ListIndexOutOfBoundsException;
	
	/**
	 * removes the item at the end of this bag 
	 * @param The index of item
	 */
	public void removeLast(int index) throws ListIndexOutOfBoundsException, ListException;
	
	/**
	 * removes an item at a random index from this bag
	 * @param The index of item
	 */
	public void removeRandom(int index) throws ListIndexOutOfBoundsException, ListException;
	
	/**
	 * returns the index of the first occurrence of an item from this bag
	 * @param The index of item
	 * @return The index of item in the list
	 */
	public Object get(int index) throws ListIndexOutOfBoundsException, ListException;
	
	/**
	 * returns the size of the list
	 * @return the size of the list
	 */
	public int size();
	
	/**
	 * returns false if the size of list is 0
	 * @return false if the size of list is 0
	 */
	public boolean isEmpty();
	
	/** 
	 * constructs a newly created List object
	 */
	public void makeEmpty();

}
