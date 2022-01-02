package session4Assignment;

import org.testng.annotations.Test;

public class Program3_2 {
	
	/* This class is implemented by Depends on Methods, 
	 * Always Run and Enabled Attributes */
	
	@Test
	public void testCase1() {
		System.out.println("testCase1");
	}

	@Test(dependsOnMethods = "session4Assignment.DependsOnMethods.testCase1", alwaysRun = true)
	public void testCase2() {
		System.out.println("testCase2");
	}

	@Test(dependsOnMethods = "session4Assignment.DependsOnMethods.testCase2")
	public void testCase3() {
		System.out.println("testCase3");
	}

	@Test(enabled = true)
	public void testCase4() {
		System.out.println("testCase4");
	}


}
