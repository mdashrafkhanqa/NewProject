package session15;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {
	
	/**
	 * 
	 * Set is a Collection that cannot contain duplicate elements.
	 * The order of a map is defined as the order depends on implementation
	 * 
	 * Set implementations: HashSet, TreeSet, and LinkedHashSet.
	 * 
	 * HashSet, which stores its elements in a hash table, is the best-performing implementation; 
	 * however it makes no guarantees concerning the order of iteration.
	 * 
	 * Incase of ordered to be maintained, use LinkedHashSet
	 * 
	 * Methods we will learn today
	 * 
	 * size, add, remove, clear, isEmpty
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Create a set
		Set<String> tests = new LinkedHashSet<String>();
		
		// Add tests to the set -- Note the order
		tests.add("Test1");
		tests.add("Test2");
		tests.add("Test3");
		tests.add("Test4");
		tests.add("Test5");
		tests.add("Test6");
		
		
		// Now get the count
		System.out.println("The total tests are :"+tests.size());
		
		// Try duplicate
		tests.add("Test1");
		
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
		System.out.println("Is Test1 is available in the set"
				+ " after removal :"+tests.contains("Test1"));
		
		// clear
		tests.clear();
		
		// check if it empty
		System.out.println("The set is empty :"
				+ ""+tests.isEmpty());
		
		
	}


}
