package project4;

import java.util.LinkedList;

/**
 * Design an ADT Address book that can be used to maintain contact information of friends and families.
 * and two references, one for each of the node's children.
 * @author Naganobu Masuda
 * @version 1.0
 */
public class TreeIterator<E> implements java.util.Iterator<E> {
	
	/**
	 * the collection traversed by this iterator
	 */
	private BaseBinaryTree<E> tree;
	
	/**
	 * an ordered list of nodes traversed by this iterator
	 * Empty list indicates no traversal type currently selected or 
	 * end of current traversal has been reached
	 */
	private LinkedList <TreeNode<E>> list;

	/**
	 * constructs an empty binary tree
	 */
	public TreeIterator() {
		this.tree = null;
	}
	/**
	 * constructs an iterator over a binary tree
	 * @param tree A reference to a binary tree
	 */
	public TreeIterator(BaseBinaryTree<E> tree) {
		this.tree = tree;
		this.list = new LinkedList<TreeNode<E>>();
	}
	
	/**
	 * returns true if the iteration has more elements
	 * @return A boolean value specifying if there is an element to be returned
	 */
	public boolean hasNext() {
		return !this.list.isEmpty();
	}

	/**
	 * returns the next element in the iteration
	 * @return the next element in the iteration
	 * @throws NoSuchElementException if the iteration has no more elements
	 */
	public E next() throws java.util.NoSuchElementException {
		return this.list.remove().getElement();
	}

	/**
	 * removes from the underlying binary tree the last element returned by this iterator (optional operation)
	 * @throws UnsupportedOperationException if the remove operation is not supported by this iterator
	 */
	public void remove() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}

	/**
	 * sets the traversal type to be preorder
	 */
	public void setPreorder() {
		this.list.clear();
		this.preorder(this.tree.root);
	}

	/**
	 * sets the traversal type to be inorder
	 */
	public void setInorder() {
		this.list.clear();
		this.inorder(this.tree.root);
	}

	/**
	 * sets the traversal type to be postorder
	 */
	public void setPostorder() {
		this.list.clear();
		this.postorder(this.tree.root);
	}

	/**
	 * traverses in preorder 
	 * @param treeNode A reference to a tree node
	 */
	private void preorder(TreeNode<E> treeNode) {
		if(treeNode != null){
			this.list.add(treeNode);
			preorder(treeNode.getLeft());
			preorder(treeNode.getRight());
		}
	}

	/**
	 * traverses in inorder 
	 * @param treeNode A reference to a tree node
	 */
	private void inorder(TreeNode<E> treeNode) {
		if(treeNode != null){
    		inorder(treeNode.getLeft());
    		this.list.add(treeNode);
    		inorder(treeNode.getRight());
    	}
	}
	
	/**
	 * traverses in postorder 
	 * @param treeNode A reference to a tree node
	 */
	private void postorder(TreeNode<E> treeNode) {
		if(treeNode != null){
		    postorder(treeNode.getLeft());
	    	postorder(treeNode.getRight());
	    	this.list.add(treeNode);
	    }
	}
} 