package session2;

public class Variables {

	// Instance variable
	String name;

	// Static variable
	static String name1 = "student";

	protected void m1(String string) {
		name = "one";
		// Local variable cannot be used outside the method
		// System.out.println(number);

	}

	public void m2(String name) {
		name = "one";
		// local variable
		String number = "one";
		System.out.println(number);

	}

}
