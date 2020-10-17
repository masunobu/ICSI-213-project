package project4;

/**
 * Design an ADT Address book that can be used to maintain contact information of friends and families.
 * and two references, one for each of the node's children.
 * @author Naganobu Masuda
 * @version 1.0
 */
public class TreeNode<E> {
	
	/**
	 * the data portion of this node
	 */
	private E element;
	
	/**
	 * the reference to left child of this node
	 */
	private TreeNode<E> left;
	
	/**
	 * the TreeNode<E> to right child of this node
	 */
	private TreeNode<E> right;

	/**
	 * constructs a default node
	 */
	public TreeNode() {
		this(null, null, null);
	}
	
	/**
	 * constructs a node with a specific element
	 * @param element A reference to the item of this node
	 */
	public TreeNode(E element) {
		this(element, null, null);
	}

	/**
	 * constructs a node with an element and two descendant nodes 
	 * @param element A reference to the data of this node
	 * @param left Reference to the left child of this node
	 * @param right Reference to the right child of this node
	 */
	public TreeNode(E element, TreeNode<E> left, TreeNode<E> right) {
		this.element = element;
		this.left = left;
		this.right = right;
	}

	/**
	 * returns the element of this node
	 * @return A reference to the element of this node
	 */
	public E getElement() {
		return this.element;
	}

	/**
	 * changes the element of this node
	 * @param element The element of this node
	 */
	public void setElement(E element) {
		this.element = element;
	}

	/**
	 * returns the left child of this node
	 * @return A reference to the left child of this node
	 */
	public TreeNode<E> getLeft() {
		return this.left;
	}

	/**
	 * changes the left child of this node
	 * @param leftChild A reference to the left child of this node
	 */
	public void setLeft(TreeNode<E> left) {
		this.left = left;
	}

	/**
	 * returns the right child of this node 
	 * @return A reference to the tight child of this node
	 */
	public TreeNode<E> getRight() {
		return this.right;
	}

	/**
	 * changes the right child of this node 
	 * @param rightChild A reference to the right child of this node
	 */
	public void setRight(TreeNode<E> right) {
		this.right = right;
	}
}