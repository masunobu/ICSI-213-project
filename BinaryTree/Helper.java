package project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Design an ADT Address book that can be used to maintain contact information of friends and families.
 * and two references, one for each of the node's children.
 * @author Naganobu Masuda
 * @version 1.0
 */
public class Helper {
	/**
	 * demonstrates and tests the ADT Binary search tree.
	 * @throws FileNotFoundException if a file is not found
	 */
	public static void start() throws FileNotFoundException{
		AddressBook<String> addBook = new AddressBook<String>();
		/**
		* creates an address book storing text file
		*/
		create(addBook);
	    /** 
	     * displays the address book
	     */
		display(addBook);
	}

	/**
	 * creates an address book storing text file
	 * @param address book reference to a strings of data
	 * @throws FileNotFoundException
	 */
	public static void create(AddressBook<String> addBook) throws FileNotFoundException{
		Scanner input = new Scanner(new File("./myDataSource/contacts.txt"));
		
		/**
		 *  adds parameter into address book
		 */
		while(input.hasNext()){
			addBook.insert(input.nextLine());
		}
		input.close();
	}
	
	/**
	 * displays data some order
	 * @param address book reference to a strings of data
	 */
	public static void display(AddressBook<String> addBook){
		Scanner scan = new Scanner(System.in);
		TreeIterator<String> it = addBook.iterator();
		
		/** 
		 * prompts user to enter the number and order the address book
		 */
		System.out.println("Enter number to order the address book.");
		System.out.print("1: Inorder, 2: Preorder, 3: Postorder ");
		int order = scan.nextInt();
		if(order == 1){
			it.setInorder();
		}else if(order == 2){
			it.setPreorder();
		}else{
			it.setPostorder();
		}
		
		/** 
		 * proceeds and prints operations
		 */
		System.out.print("Open the address book? y/n  ");
		String operation = scan.next();
		if(operation.equals("y")){
			int i =1;
			while(it.hasNext()){
				System.out.println(i + ": " + it.next());
				i++;
			}
		}
//		else if{}
		scan.close();
	}
}