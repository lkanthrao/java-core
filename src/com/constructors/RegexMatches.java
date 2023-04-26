package com.constructors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches
{
	public static void main( String args[] ){

		Object[] obj = new Object[1];
//		Object[] obj = new Object[0]; here the size is 0, do not confuse new Object[0] with new Object[](0);
		obj[0] = "1";
		// String to be scanned to find the pattern.
		String line = "#Value##Custom#";
		String pattern = "(#)(.*)(#)";

		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);

		// Now create matcher object.
		Matcher m = r.matcher(line);
		if (m.find( )) {
			System.out.println("Found value: " + m.group(0) );
			System.out.println("Found value: " + m.group(1) );
			System.out.println("Found value: " + m.group(2) );
		} else {
			System.out.println("NO MATCH");
		}
	}
}