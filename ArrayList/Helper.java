package project1;

import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Create an ADT Bag composed of a list of grocery items and a set of operations on the list.
 * @author Naganobu Masuda
 * @version 1.0
 */
public class Helper {
	
	/**
	 * Demonstrates and tests the array-based ADT list.
	 * @throws ListException If size() == 0
	 * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
	 * @throws FileNotFoundException if a file is not found
	 */
	public static void start() throws FileNotFoundException, ListIndexOutOfBoundsException, ListException{
		Scanner scan = new Scanner(System.in);
		ListArrayListBased list = new ListArrayListBased();

		/**
		 * creates an empty bag
		 */
		create(list);
		
		/**
		 * adds an item to the end of the list of this bag 
		 */
//		System.out.println("Enter the name of new item added");
//		String item = scan.nextLine();
//		list.insert(item);
		
		/**
		 * (Optional) adds list "Banana" at index 2 
		 */
//		list.addItem(2, "Banana");

		/**
		 * removes the item at the end of this bag 
		 */
//		list.removeLast(list.size()-1);
//		System.out.println("the item being selected lastly is removed");
		
		/**
		 * removes an item at a random index from this bag 
		 */
//		Random random = new Random();
//		int randomValue = random.nextInt(list.size());
//		list.removeRandom(randomValue);
//		System.out.println("one item selected randomly is removed");
		
		/**
		 * gets the index of the first occurrence of an item from this bag 
		 */
//		System.out.println("first occurrence of an item of this bag is " + list.get(0));
		
		/**
		 * gets a reference to an item at position index of this bag 
		 */
//		System.out.println("Enter the number");
//		int number = scan.nextInt();
//		System.out.println(number + " index position item is " + list.get(number-1));
		
		/**
		 * checks how many items are there in this bag 
		 */
//		System.out.println(list.size() + " items in this bag");
		
		/**
		 * checks to see if this bag is empty 
		 */
//		System.out.println("true if this bag is empty, but flase not --- " + list.isEmpty());
		
		/** 
		 * makes this bag empty 
		 */
//		list.makeEmpty();
//		System.out.println("bag is empty");
		
	    /** 
	     * displays the list
	     */
		System.out.println("---in the bag---");
		display(list);
		
		scan.close();
	}
	
	/**
	 * Creates a list of charges.
	 * @param list A reference to a list of data
	 * @throws ListIndexOutOfBoundsException 
	 */
	private static void create(ListArrayListBased list) throws FileNotFoundException, ListIndexOutOfBoundsException{
		Scanner input = new Scanner(new File("./myDataSource/itemlist.txt"));
		
		/**
		 *  adds parameter into Array list 
		 */
		while(input.hasNext()){
			list.insert(input.next());
	    }
		input.close();
	}
	
	/**
	 * Displays data in order. 
	 * @param list A reference to a list of data
	 * @throws ListException if size() == 0
	 * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
	 */
	private static void display(ListArrayListBased list) throws ListIndexOutOfBoundsException, ListException{
	   for(int i = 0; i < list.size(); i++){
		   System.out.println(list.get(i));
	   }
	}

}