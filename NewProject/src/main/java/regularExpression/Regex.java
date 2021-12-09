package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public static void main (String args[]){

		// Define the pattern
		String pattern = "[0-9]{5,6}";

		// Compile the pattern
		Pattern p = Pattern.compile(pattern);

		// Get the matcher
		Matcher match = p.matcher("56823");		
		System.out.println(match.matches());

	}


}
