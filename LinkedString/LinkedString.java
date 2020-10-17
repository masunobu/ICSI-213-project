package project2;

import java.util.ArrayList;

/**
 * create a reference-based implementation on some String operations
 * @author Naganobu Masuda
 * @version 1.0
 */

public class LinkedString implements LinkedStringInterface<LinkedString>{
	
	private ArrayList<LinkedString> list;
	
	/**
	 * A reference to an array of data
	 */
	public Node head;
	
	/**
	 * The number of data in this ADT list
	 */
	public int count;

	/**
	 * creates an empty linked list
	 */
	public LinkedString(){
		this.head = null;
	    this.count = 0;
	}
	
	/**
	 * creates a linked list
	 * @param String and char array 
	 */
	public LinkedString(String name, char[] character){
		this.head = new Node(name.charAt(0));
		Node current = this.head;
		for(int i = 1; i < name.length(); i++){
			current.setNext(new Node(name.charAt(i)));
			current = current.getNext();
			this.count++;
		}
	}
	
	/**
	 * creates a linked list
	 * @param String
	 */
	public LinkedString(String name){
		this(name, null);
	}

	/**
	 * adds an element to the end of the list
	 * @param element A reference to this added element
	 */
	public void add(LinkedString item){
		this.list.add(item);
	}
	
	/**
	 * gets an element at the index of the list
	 * @param  index An integer specifying the position of the getting element
	 * @return An character specifying the retrieved element
	 * @throws ListException 
	 * @throws ListIndexOutOfBoundsException 
	 */
	public char charAt(int index) throws ListException, ListIndexOutOfBoundsException {
		if(this.count == 0){
			throw new ListException("The list is empty, and no elements can be gotton.");
		}else if(index < 0 || index > this.count){
			throw new ListIndexOutOfBoundsException("The index value must be between 0 and " + (this.count-1));
		}else{
			return (char)get(index-1);
		}
	}
	
	/**
	 * concatenates a specified linked string to the end of this linked string
	 * @param  index integers specifying the position of the getting element
	 * @return String specifying the retrieved element
	 * @throws ListIndexOutOfBoundsException 
	 * @throws ListException 
	 */
	public LinkedString concat(int firstString, int SecondString) throws ListIndexOutOfBoundsException, ListException{
		if (firstString < 0 || SecondString < 0){
			throw new ListIndexOutOfBoundsException("The index value must be between 0 and " + (this.length()-1));
		}else{
			String substr = "";
            substr += get(firstString);
	        System.out.println("concatenating of linked string from " + firstString + " to " + SecondString + " is " + substr);
	        LinkedString linkedSubstring = new LinkedString(substr);
	        return linkedSubstring;
		}
	}
		
	/**
	 * determines whether a list is empty
	 * @return A boolean value specifying if this list is empty or not
	 */
	public boolean isEmpty() {
		return this.count == 0; 
	}

	/**
	 * returns the length of a list 
	 * @return An integer specifying the length of a list
	 */
	public int length() {
		return this.count;
	}

	/**
	 * returns a new linked string that is a substring of this linked string
	 * @param  index integers specifying the position of the getting element
	 * @return String specifying the retrieved element
	 * @throws ListException 
	 * @throws ListIndexOutOfBoundsException
	 */
	public LinkedString substring(int beginIndex, int endIndex) throws ListIndexOutOfBoundsException, ListException {
		if (beginIndex < 0 || endIndex < 0){
			throw new ListIndexOutOfBoundsException("The index value must be between 0 and " + (this.length()-1));
		}else{
			String strT = "";
	        for(int i = beginIndex; i <= endIndex; i++){
	        	strT += charAt(i);
	        }
	        System.out.println("substring of linked string from " + beginIndex + " to " + endIndex + " is " +  strT);
	        LinkedString stringTaken = new LinkedString(strT, null);
	        return stringTaken;
			}
		}

	/**
	 * returns a reference to a specific node at index.
	 * @return The index of a specific node
	 */
	  private Node find(int index){
		  int position = 0;
		  Node current = this.head;
		  while(position != index){
			  position++;
			  current = current.getNext();
		  }
		 return current;
	  }
	  
	 /** 
	  * Returns an element by position.
	  * @param index An integer specifying the position of the element
	  * @return An object specifying the retrieved element 
	  * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
	  * @throws ListException if the list is empty
	  */
	  public Object get(int index) throws ListIndexOutOfBoundsException, ListException{
		  if(this.count == 0){
			  throw new ListException("The list is empty");
		  }else if(index < 0 || index > this.length()){
			  throw new ListIndexOutOfBoundsException("The index value must be between 0 and 9.");
		  }else{
			  return find(index).getItem();
		  }
	  }
}