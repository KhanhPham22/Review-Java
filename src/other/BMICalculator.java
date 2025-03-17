
package other;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double weight = 0 , height = 0;
		
		while(true) {
			System.out.println("Enter your weight in kilograms (kg)");
			if (sc.hasNextDouble()) {
				weight = sc.nextDouble();
				if (weight > 0) {
					break;
				}else {
					System.out.println("Weight must be greater than zero.");
				}
			} else {
				System.out.println("Please enter a valid number of your weight");
				sc.next();
			}
		}
		
		while (true) {
			System.out.println("Enter your height in meters (m):");
			if (sc.hasNextDouble()) {
				height = sc.nextDouble();
				if (height > 0) {
					break;
				} else {
					System.out.println("Height must be greater than zero");
				}
			} else {
				System.out.println("Please enter a valid number for height.");
				sc.next();
			}
		}
		
		double bmi = weight /(height * height);
		
		System.out.printf("Your BMI is: %.2f\n", bmi);
		
		if (bmi < 18.5) {
			System.out.println("You are underweight");
		} else if (bmi >= 18.5 && bmi <24.9) {
			System.out.println("You have a normal weight");
		} else if (bmi >= 25 && bmi < 29.9) {
			System.out.println("You are overweight");
		} else {
			System.out.println("You are obese");
		}
		sc.close();
	}

}
