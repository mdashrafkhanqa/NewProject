package session2;

import java.util.ArrayList;

public class Inheritance extends SimpleJavaProgram {

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		// Modifiers

		// Calling other class methods by creating object
		/*
		 * SimpleJavaProgram sp = new SimpleJavaProgram(); sp.sum(); sp.sum1();
		 */

		// Calling other class methods using inheritance without creating object
		sum();
		sum1();
		// primitive data type
		String num;
		num = "number";
		char c = 'c';
		// non - primitive data type
		String s = new String();
		// Array A = new Array();
		ArrayList AL = new ArrayList();

	}

	// over ridding
	public static void sum() {
		sum = num - a - b;
		System.out.println("The sum is " + sum);

	}

}
