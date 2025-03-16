package other;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double num1 ,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thu nhat");
		num1 = sc.nextDouble();
		System.out.println("Nhap so thu hai");
		num2 = sc.nextDouble();
		System.out.print("Chon phep tinh(+,-,*,/):");
		char operator = sc.next().charAt(0);
		sc.close();
		double output;
		
		switch(operator){
		case '+':
			output = num1+ num2;
			break;
			
		case '-' :
			output = num1 - num2;
			break;
			
		case '*':
			output = num1 * num2;
			break;
			
		case '/':
			output = num1 / num2;
			break;
			
		default:
			System.out.printf("Ban da chon sai phep tinh");
			return;
		}
		System.out.println("Ket qua cua 2 phep tinh la");
		System.out.println(num1+" "+operator+" "+num2+"="+output);
		
	}

}
