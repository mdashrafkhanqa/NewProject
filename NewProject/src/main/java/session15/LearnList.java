package session15;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {
	
	/**
	 * 
	 * Collections - 
	 * 
	 * 
	 * All collections frameworks contain the following:
	 * 
	 * 1) Interfaces: These are abstract data types that 
	 * represent collections.Interfaces allow collections 
	 * to be manipulated independently of the details
	 * 
	 * 2) Implementations: These are the concrete 
	 * implementations of the collection interfaces.
	 * In essence, they are reusable data structures.
	 * 
	 * 3) Algorithms: These are the methods that perform 
	 * useful computations, such as searching and sorting, 
	 * on objects that implement collection interfaces.
	 * The algorithms are said to be polymorphic: 
	 * that is, the same method can be used on many
	 * different implementations of the appropriate 
	 * collection interface. 
	 * 
	 * 
	 */


	/**
	 * 
	 * 1) 
	 * List is an interface
	 * An ordered collection (also known as a sequence). 
	 * The user of this interface has precise control over where in the list each element is inserted. 
	 * The user can access elements by their integer index (position in the list),
	 * and search for elements in the list.
	 * 
	 * Lists typically allow duplicate elements.
	 * Lists (like Java arrays) are zero based 
	 * 
	 * 2) 
	 * ArrayList is one of the implementation of the List interface 
	 * ArrayList has few additional methods on top of List interface
	 *
	 * 3) 
	 * Methods we will learn today
	 * 
	 * size, get(index), add, remove, clear, isEmpty
	 */

	public static void main(String[] args) {

		// Create a List
		List<String> tests = new LinkedList<String>();

		// Add tests to the List -- Note the order
		tests.add("Test1");
		tests.add("Test2");
		tests.add("Test3");
		tests.add("Test4");
		tests.add("Test5");
		tests.add("Test6");
		
		// Now get the count
		System.out.println("The total tests are :"+tests.size());

		// Try duplicate
		tests.add("Test7");

		// Now get the count
		System.out.println("The total tests are :"+tests.size());

		// Print the name of all tests -- you will notice the order in the list not maintained
		for (String mentor : tests) {
			System.out.println(mentor);
		}

		// contains
		System.out.println("Is Test1 is available "
				+ "in the set :"+tests.contains("Test1"));

		// remove
		tests.remove("Test1");

		// contains
		System.out.println("Is Test1 is available in the List"
				+ " after removal :"+tests.contains("Test1"));


		System.out.println("*********************");
		
		Collections.sort(tests);
		for (String mentor : tests) {			
			System.out.println(mentor);
		}
		
		// clear
		tests.clear();

		// check if it empty
		System.out.println("The set is empty :"
				+ ""+tests.isEmpty());

	}


}
