package project2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * create a reference-based implementation on some String operations
 * @author Naganobu Masuda
 * @version 1.0
 */
public class Helper {
	/**
	 * demonstrates and tests the array-based ADT list.
	 * @throws ListException If size() == 0
	 * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
	 * @throws FileNotFoundException if a file is not found
	 */
	public static void start() throws FileNotFoundException, ListIndexOutOfBoundsException, ListException{
		Scanner scan = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		/**
		* creates an array list storing text file
		*/
		create(array);
		
	    /** 
	     * displays the list
	     */
		System.out.println("---in the display---");
		displayAndMore(array);
		
		scan.close();
	}
	
	/**
	 * creates an array list storing text file
	 * @param array A reference to a list of data
	 * @throws FileNotFoundException
	 */
	private static void create(ArrayList<String> array) throws FileNotFoundException{
		Scanner input = new Scanner(new File("./myDataSource/items.txt"));
		
		/**
		 *  adds parameter into Array list 
		 */
		while(input.hasNext()){
			array.add(input.nextLine());
		}
		System.out.println("In the array list: " + array);
		input.close();
	}
	
	/**
	 * displays data in order
	 * @param array A reference to a list of data
	 * @throws ListException if size() == 0
	 * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
	 */
	private static void displayAndMore(ArrayList<String> array) throws ListIndexOutOfBoundsException, ListException{
		Scanner scan = new Scanner(System.in);
		LinkedString list;
		
		/** 
		 * prompts user to enter the number and get element from list
		 */
		System.out.print("Enter the number to get name from list: ");
		int number = scan.nextInt();
		String str1 = array.get(number);
		System.out.println("You're choosing name: " + str1);
		list = new LinkedString(str1);
		
		/** 
		 * proceeds and prints operations once this list is checked not empty
		 */
		if(list.isEmpty() != true){
			System.out.println("this list is empty <- " + list.isEmpty());
			
			/** 
			 * prints the length of this element
			 */
			System.out.println("this linked string length is " + list.length());
			
			/** 
			 * prints the index of character of this element
			 */
			System.out.print("Enter the index of character of this name: ");
			int char1 = scan.nextInt();
			char str = list.charAt(char1);
			System.out.println(char1 + " index character of this name is " + str);
			
			/** 
			 * prints the substring of this element from particular point to point
			 */
			System.out.println("Enter two indexs to substring of linked string: ");
			int sub1 = scan.nextInt();
			int sub2 = scan.nextInt();
			list.substring(sub1,sub2);
			
			/** 
			 * prints the concatenating of index of this element to the other index
			 */
			System.out.println("Enter two indexs to concatinate of linked string: ");
			int concat1 = scan.nextInt();
			int concat2 = scan.nextInt();
			list.concat(concat1, concat2);
		
		}else{
			/** 
			 * shows if this list is empty
			 */
			System.out.println("this list is empty");
		}
		scan.close();
	}
}