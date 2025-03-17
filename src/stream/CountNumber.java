package stream;

import java.util.Arrays;
import java.util.List;

public class CountNumber {

	public static void main(String[] args) {
		List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
	    System.out.println("Original list of strings (colors): " + colors);
	    char startingLetter = 'B';
	  
	    long ctr = colors.stream()
	      .filter(s -> s.startsWith(String.valueOf(startingLetter)))
	      .count();
	    System.out.println("\nNumber of colors starting with '" + startingLetter + "': " + ctr);
	    char startingLetter1 = 'Y';
	 
	    ctr = colors.stream()
	      .filter(s -> s.startsWith(String.valueOf(startingLetter1)))
	      .count();
	    System.out.println("\nNumber of colors starting with '" + startingLetter1 + "': " + ctr);

	}

}
