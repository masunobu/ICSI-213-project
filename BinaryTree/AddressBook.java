package project4;

/**
 * Design an ADT Address book that can be used to maintain contact information of friends and families.
 * and two references, one for each of the node's children.
 * @author Naganobu Masuda
 * @version 1.0
 */
public class AddressBook<E extends Comparable<E>> implements ADTAddressBook<E>{
	
	private BinarySearchTree<E> tree;
	
	private int count;

	/**
	 * constructs a newly created List object
	 */
	public AddressBook(){
		this.tree = new BinarySearchTree<E>();
	}

	/**
	 * adds an item to the end of the address book
	 * @param The name of item
	 */
	public void insert(E item){
		this.tree.insert(item);
		count++;
	}
	
	/**
	 * removes the item of the address book
	 * @param The name of item
	 */
	public void delete(E item) throws TreeException{
	    if(count == 0){
       	    throw new TreeException("The list is empty, and no elements can be removed.");
		}else{
			this.tree.delete(item);
			count--;
		}
	 }
	
	/**
	 * searches the item of the address book
	 * @param The name of item
	 * @return The name of item
	 */
    public boolean search(E item) throws TreeException{
    	if(count == 0){
       	    throw new TreeException("The list is empty, and no elements can be removed.");
    	}else{
        	return this.tree.search(item);
    	}
    }
    
    public E search(TreeNode<E> root, E sear) throws TreeException{
    	if(isEmpty()){
    		throw new TreeException("TreeException: Empty tree");
    	}else if(sear.compareTo(root.getElement()) == 0){
           	return root.getElement();
    	}else{
    		if(sear.compareTo(root.getElement()) < 0){
    			return search(root.getLeft(), sear);
    		}else{
    			return search(root.getRight(), sear);
    		}
    	}
    }
	
	/**
	 * returns the item of the address book
	 * @param The name of item
	 * @return The name of item
	 */
	public E get(E value) throws TreeException{
		if(count == 0){
			throw new TreeException("The list is empty, and no elements can be removed.");
		}else{
			return this.tree.get(value);
		}
	}
	
	/**
	 * returns the size of the address book
	 * @return the size of the address book
	 */
	public int size() {
		return this.tree.size();
	}
	
	/**
	 * returns false if the size the address book is 0
	 * @return false if the size the address book is 0
	 */
	public boolean isEmpty() {
		return count == 0; 
	}
	
	/** 
	 * constructs a newly created List object
	 */
	public void removeAll() {
		this.tree = new BinarySearchTree<E>();
	}

	public TreeIterator<E> iterator() {
		return this.tree.iterator();
	}
}