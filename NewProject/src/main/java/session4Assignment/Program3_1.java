package session4Assignment;

import org.testng.annotations.Test;

public class Program3_1 {
	
	/* This class is implemented by Priority, Expected Exceptions 
	 * and Success Percentage Attributes */
	
	@Test(priority = 2)
	public void testCase1() {
		System.out.println("TestCase1 Passed Succesfully");
	}
	
	@Test(priority = 4)
	public void testCase2() {
		System.out.println("TestCase2 Passed Succesfully");
	}

	@Test(priority = 3, successPercentage = 100)
	public void testCase3() {
		System.out.println("TestCase3 Passed Succesfully");
	}

	@Test(priority = 1, expectedExceptions = RuntimeException.class)
	public void testCase4() {
		System.out.println("TestCase4 Passed Succesfully");
		throw new RuntimeException();
	}


}
