package session15;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {
	
	/**
	 * 
	 * Map - interface
	 * 
	 * 
	 * An object that maps keys to values. A map cannot contain duplicate keys; 
	 * each key can map to at most one value.
	 * 
	 * 
	 * 
	 * The Map interface provides three collection views, which allow a map's contents to be viewed
	 * as a 1) set of keys, 2) collection of values, or 3) set of key-value mappings. 
	 * The order of a map is defined as the order depends on implementation
	 * 
	 *  Some map implementations, like the 
	 *  TreeMap class, make specific guarantees as to their order by key
	 *  HashMap class, do not guarantee any order
	 *  LinkedHashMap - maintains the order
	 *  
	 *  Methods:
	 *  
	 *  1) get(key) 
	 *  2) containsKey(key)
	 *  3) entrySet()
	 *  4) put(key, value)
	 *  5) size
	 *  6) remove(key)
	 *  7) clear
	 *  8) isEmpty
	 * 
	 * Other key observations of HashMap, LinkedHasMap)
	 *  # non-synchronized (not thread-safe)
	 *  # null values allowed (ofcourse 1 key)
	 * 
	 */	
	
	
	
	public static void main(String[] args) {
		
		// You can't use primitive types as generic arguments in Java
		Map<Integer, String>  tests = new HashMap<Integer, String>();
		
		// TreeMap: "is sorted according to the natural ordering of its keys"
		// HashMap: "makes no guarantees as to the order of the map"
		// LinkedHashMap: "with predictable iteration order [...] 
		// which is normally the order in which keys were inserted into the map (insertion-order)."
		
		// Add tests to the map (note the order)
		tests.put(5,"Test1");
		tests.put(2,"Test2");
		tests.put(4,"Test3");
		tests.put(6,"Test4");
		tests.put(3,"Test5");
		tests.put(1,"Test6");
		tests.put(null,null);
		tests.put(7,"Test7");
		tests.put(7,"Test8");
		
		// Now get the count
		System.out.println("The total tests are"
				+ " :"+tests.size());
		
		// find the value of 7
		System.out.println("The value of 7 is :"+tests.get(7));
		
		// Print the name of all tests -- you will notice the order in the map not maintained
		for (Entry<Integer, String> eachtest : tests.entrySet()) {
			
			System.out.println("The key is: "+eachtest.getKey()+""
					+ " and value is: "+eachtest.getValue()); 			
		}
		
		// contains
		System.out.println("Is key:5 is available in the "
				+ "set :"+tests.containsKey(5));
		
		// remove
		tests.remove(5);
		
		// contains
		System.out.println("Is key:5 is available in"
				+ " the set after removal :"+tests.containsKey(5));
		
		// clear
		tests.clear();
		
		// check if it empty
		System.out.println("The set is empty "
				+ ":"+tests.isEmpty());
		
		
		
		
	}


}
