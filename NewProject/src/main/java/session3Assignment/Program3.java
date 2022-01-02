package session3Assignment;

import org.testng.annotations.Test;

public class Program3 implements InterfaceOne, InterfaceTwo{
	
	@Test
	public void run() {
		
		add(7,5);
		deduct(12,10);

	}
	
	// Method implemented from InterfaceOne
	public void add(int A, int B) {
		int sum = A+B;
		System.out.println("Result is "+sum);
		
	}
	
	// Method implemented from InterfaceTwo
	public void deduct(int A, int B) {
		int sub = A-B;
		System.out.println("Result is "+sub);
		
	}

}
