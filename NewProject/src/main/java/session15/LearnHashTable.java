package session15;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class LearnHashTable {
	
	/**
	 * HashTable - class implements map
	 * 
	 * 
	 * This class implements a hash table, which maps keys to values. 
	 * Any non-null object can be used as a key or as a value.
	 * 
	 * 
	 *  Other key observations 
	 *  # synchronized (hence thread-safe in multi threading)
	 *  # no null values allowed
	 *  
	 *  Methods:
	 *  
	 *  1) get(key) 
	 *  2) containsKey(key)
	 *  3) entrySet()
	 *  4) put(key, value)
	 *  5) size
	 *  6) remove
	 *  7) clear
	 *  8) isEmpty
	 * 
	 */	
	
	
	
	public static void main(String[] args) {
		
		// You can't use primitive types as generic arguments in Java
		Map<Integer, String>  tests = new Hashtable<Integer, String>();
		
		// TreeMap: "is sorted according to the natural ordering of its keys"
		// HashMap: "makes no guarantees as to the order of the map"
		// LinkedHashMap: "with predictable iteration order [...] 
		// which is normally the order in which keys were inserted into the map (insertion-order)."
		
		// Add tests to the map (note the order)
		tests.put(5,"Test1");
		//tests.put(5,"Test0");
		tests.put(2,"Test2");
		tests.put(4,"Test3");
		tests.put(6,"Test4");
		tests.put(3,"Test5");
		tests.put(1,"Test6");
		//tests.put(null,null);

		
		
		// Now get the count
		System.out.println("The total tests are :"+tests.size());
		
		// find the value of 4
		System.out.println("The value of 4 is :"+tests.get(4));
		
		// Print the name of all tests -- you will notice the order in the hashtable not maintained
		for (Entry<Integer, String> eachtest : tests.entrySet()) {
			
			System.out.println("The key is: "+eachtest.getKey()+""
					+ " and value is: "+eachtest.getValue()); 			
		}
		
		// contains
		System.out.println("Is key:5 is available in the set "
				+ ":"+tests.containsKey(5));
		
		// remove
		tests.remove(5);
		
		// contains
		System.out.println("Is key:5 is available in the set after "
				+ "removal :"+tests.containsKey(5));
		
		// clear
		tests.clear();
		
		// check if it empty
		System.out.println("The set is empty :"
				+ ""+tests.isEmpty());		
		
	}


}
