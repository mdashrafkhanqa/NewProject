package session2;

public class SimpleJavaProgram {

	// Instance variable
	static int num = 10, a = 1, b = 2; // static variable
	static int sum = 0;

	public static void main(String[] args) {
		int c = 5; // local variable
		sum = 1;
		sum = num + a + b + c;
		System.out.println("The sum is " + sum);
		sum1();
		sum(5, 6);
	}

	// using instance variables in all methods of the class
	public static void sum() {
		sum = num + a + a + b;
	}

	// using instance variables in all methods of the class
	protected static void sum1() {
		sum = num + a + a + b;
		System.out.println("The sum is " + sum);

	}

	// over loading
	public static void sum(int a, int b) {
		sum = num + a + a + b;
	}

	// over loading
	public static void sum(String a, String b) {
		// sum=num+a+a+b;
	}

	// over loading
	public static void sum(int a, String b) {
		// sum=num+a+a+b;
	}

	// over loading
	public static void sum(int a, int b, int c) {
		sum = num + a + a + b + c;
	}

	public static void sum(int a, int b, int c, int d) {
		sum = num + a + a + b + c;
	}

}
