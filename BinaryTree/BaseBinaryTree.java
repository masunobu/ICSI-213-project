package project4;

/**
 * Design an ADT Address book that can be used to maintain contact information of friends and families.
 * and two references, one for each of the node's children.
 * @author Naganobu Masuda
 * @version 1.0
 */
public abstract class BaseBinaryTree<E> {
	
	/**
	 * the root of this tree
	 */
	protected TreeNode<E> root;

	/**
	 * creates an empty binary tree
	 */
	public BaseBinaryTree() {
		this.root = null;
	}
	
	/**
	 * creates a one-node binary tree whose root contains a root item
	 * @param rootItem The item of the root
	 */
	public BaseBinaryTree(E rootItem) {
		this.root = new TreeNode<E>(rootItem, null, null);
	}

	/**
	 * returns true if the tree is empty, else returns false
	 * @return A value specifying if the tree is empty
	 */
	public boolean isEmpty() {
		return this.root == null;
	} 

	/**
	 * removes all nodes from the tree
	 */
	public void makeEmpty() {
		this.root = null;
	}

	/**
	 * returns the element in the tree's root
	 * @return A reference to the item of the root
	 * @throws TreeException if the tree is empty
	 */
	public E getRoot() throws TreeException {
		if (isEmpty()) {
			throw new TreeException("TreeException: Empty tree");
	    }else {
	    	return this.root.getElement();
	    }
	}

	/**
	 * changes the root element of this binary tree
	 * @param value A reference to the new root
	 * @throws  UnsupportedOperationException if operation is not supported.
	 */
	public abstract void setRoot(E value) throws UnsupportedOperationException;
}   
