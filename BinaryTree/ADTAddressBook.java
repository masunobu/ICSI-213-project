package project4;

/**
 * Design an ADT Address book that can be used to maintain contact information of friends and families.
 * and two references, one for each of the node's children.
 * @author Naganobu Masuda
 * @version 1.0
 */
public interface ADTAddressBook<E> {
	
	/**
	 * adds an item to the end of the address book
	 * @param The name of item
	 */
	public void insert(E item);
	
	/**
	 * removes the item of the address book
	 * @param The name of item
	 */
	public void delete(E item) throws TreeException;
	
	/**
	 * searches the item of the address book
	 * @param The name of item
	 * @return The name of item
	 */
    public boolean search(E item) throws TreeException;
    
    public E search(TreeNode<E> root, E sear) throws TreeException;
	
	/**
	 * returns the item of the address book
	 * @param The name of item
	 * @return The name of item
	 */
	public E get(E value) throws TreeException;
	
	/**
	 * returns the size of the address book
	 * @return the size of the address book
	 */
	public int size();
	
	/**
	 * returns false if the size the address book is 0
	 * @return false if the size the address book is 0
	 */
	public boolean isEmpty();
	
	/** 
	 * constructs a newly created List object
	 */
	public void removeAll();

	public TreeIterator<E> iterator();
}
