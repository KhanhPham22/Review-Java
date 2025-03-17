package stream;

import java.util.Arrays;
import java.util.List;

public class NumberSum {

	public static void main(String[] args) {
		List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int sumOfEvens = numbers.stream()
			.filter(num -> num % 2 == 0)
			.mapToInt(Integer::intValue)
			.sum();
		
		System.out.println("sum of evens number:" + sumOfEvens);
		
		int sumOfOdds = numbers.stream()
				.filter(num -> num %2 != 0)
				.mapToInt(Integer::intValue)
				.sum();
		
		System.out.println("sum of odd number:" +sumOfOdds);
	}

}
