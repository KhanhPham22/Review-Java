package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListofStrings {

	public static void main(String[] args) {
		List <String> colors = Arrays.asList("Red", "Blue", "White", "Pink", "Black");
		System.out.println("original list of string colors:" + colors);
	
		List <String> ascendingOrder =  colors.stream()
				.sorted()
				.collect(Collectors.toList());
		
		List <String> descendingOrder = colors.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println("\nSorted in Ascending order:"+ ascendingOrder);
		System.out.println("\nSorted in Descending order:" + descendingOrder);
	}

}
