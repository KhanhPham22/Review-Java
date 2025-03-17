package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUpperLower {

	public static void main(String[] args) {
		List <String> colors = Arrays.asList("BLACK", "Blue", "white", "GrEEn", "pink");
		System.out.println("List of strings:" + colors);
		
		List <String> uppercaseStrings =  colors.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println("\nUppercase Strings:" + uppercaseStrings);
		
		List <String> lowercaseStrings = colors.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		
		System.out.println("\nLowercase Strings:" + lowercaseStrings);
	}

}
