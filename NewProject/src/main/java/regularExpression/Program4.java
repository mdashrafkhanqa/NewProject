package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program4 {

	public static void main(String[] args) {

		// Define the pattern
		String pattern = "[a-zA-Z0-9_.]+@[a-zA-Z0-9-]{4,}.[a-zA-Z]{7,}";

		// Compile the pattern
		Pattern p = Pattern.compile(pattern);

		// Get the matcher
		Matcher match = p.matcher("test_123.@test.testing");

		// Confirm the matches
		System.out.println(match.matches());

	}

}
