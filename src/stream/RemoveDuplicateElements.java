package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		List <Integer> nums = Arrays.asList(10, 69, 33, 45, 33, 69, 15, 15 ,24);
		System.out.println("Original list of number" +nums);
		
		List <Integer> distinctNumbers = nums.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("After remove duplicates from list:" +distinctNumbers);
	}

}
