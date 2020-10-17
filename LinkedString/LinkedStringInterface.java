package project2;

/**
 * create a reference-based implementation on some String operations
 * @author Naganobu Masuda
 * @version 1.0
 */

public interface LinkedStringInterface<T> {

	/**
	 * adds an element to the end of the list
	 * @param element A reference to this added element
	 */
	public void add(LinkedString item);
	  
	/**
	 * gets an element at the index of the list
	 * @param  index An integer specifying the position of the getting element
	 * @return An character specifying the retrieved element
	 * @throws ListException 
	 * @throws ListIndexOutOfBoundsException 
	 */
	public char charAt(int index) throws ListException, ListIndexOutOfBoundsException;
	 
	/**
	 * concatenates a specified linked string to the end of this linked string
	 * @param  index integers specifying the position of the getting element
	 * @return String specifying the retrieved element
	 * @throws ListIndexOutOfBoundsException 
	 * @throws ListException 
	 */
	public LinkedString concat(int firstString, int SecondString)  throws ListIndexOutOfBoundsException, ListException;
	  
	/**
	 * determines whether a list is empty
	 * @return A boolean value specifying if this list is empty or not
	 */
	public boolean isEmpty();

	/**
	 * returns the length of a list 
	 * @return An integer specifying the length of a list
	 */
	public int length();

	/**
	 * returns a new linked string that is a substring of this linked string
	 * @param  index integers specifying the position of the getting element
	 * @return String specifying the retrieved element
	 * @throws ListException 
	 * @throws ListIndexOutOfBoundsException
	 */
	public LinkedString substring(int beginIndex, int endIndex) throws ListIndexOutOfBoundsException, ListException;
} 