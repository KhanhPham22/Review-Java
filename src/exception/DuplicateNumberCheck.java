package exception;
import java.util.*;

public class DuplicateNumberCheck {

	public static void main(String[] args) {
		try {
			List <Integer > numbers = readNumbersFromUser();
			checkDuplicates(numbers);
			System.out.println("No duplicates numbers!");
		}catch (DuplicateNumberException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}



public static List <Integer> readNumbersFromUser(){
	List < Integer > numbers = new ArrayList < > ();
	Scanner sc = new Scanner(System.in);
	 System.out.print("How many numbers do you want to input? ");
	 int count = sc.nextInt();
	 
	 System.out.println("Input the integers");
	 for (int i = 0; i< count; i++) {
		 int num =sc.nextInt();
		 numbers.add(num);
	 }
	 sc.close();
	 return numbers;
}

public static void checkDuplicates(List <Integer> numbers) throws DuplicateNumberException {
	Set <Integer> uniqueNumbers = new HashSet <> ();
	
	for (int num: numbers) {
		if (uniqueNumbers.contains(num)) {
			throw new DuplicateNumberException("Duplicate number found:" + num);
		}
		uniqueNumbers.add(num);
	}
}

}

class DuplicateNumberException extends Exception {
	public DuplicateNumberException(String message) {
		super(message);
	}
}