package project2;

/**
 * create a reference-based implementation on some String operations
 * @author Naganobu Masuda
 * @version 1.0
 */

public class Node {
	/**
	 * The element of this node
	 */
	private Object item;
	/**
	 * The link to next node
	 */
	private Node next;
	/**
	 * The link to previous node
	 */
	private Node previous;

	/**
	 * Constructs a default node.
	 */
	public Node() {
		this(null, null, null);
	}  
	/**
	 * Constructs a node with an element and link to a null node.
	 * @param element A reference to the element of this node
	 */
	public Node(Object item) {
		this(item, null, null);
	}  
	/**
	 * Constructs a node with an element and a link to next node.
	 * @param element A reference to the element of this node
	 * @param element A reference to the element of next node
	 * @param element A reference to the element of previous node
	 */
	public Node(Object item, Node next, Node previous) {
		this.item = item;
		this.next = next;
		this.previous = previous;
    }
	
	/**
	 * Returns the element of this node.
	 * @return The element of this node
	 */
	public Object getItem() {
		return this.item;
	}
	
	/**
	 * Changes the element of this node.
	 * @param A reference to an element
	 */
	public void setItem(Object item) {
		this.item = item;
	}
	
	/**
	 * Returns the next reference of this node.
	 * @return A reference to the next node of this node
	 */
	public Node getNext() {
		return this.next;
	}
	
	/**
	 * Changes the next reference of this node
	 * @param next A reference to the next node of this node
	 */
	public void setNext(Node next) {
		this.next = next;
	}  
	
	/**
	 * Returns the previous reference of this node.
	 * @return A reference to the previous node of this node
	 */
	public Node getPrevious() {
		return this.previous;
	}
	
	/**
	 * Changes the previous reference of this node
	 * @param next A reference to the previous node of this node
	 */
	public void setPrevious(Node previous) {
		this.previous = previous;
	}  
	
	/**
	 * Returns a string representation of this node.
	 * @return A string representation of this node
	 */
	public String toString(){
		return getClass().getSimpleName() + ": " + this.item;
	}
}  