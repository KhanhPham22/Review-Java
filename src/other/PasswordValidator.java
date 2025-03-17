package other;

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a password:");
		String password = sc.nextLine();
		
		boolean isValid = validatePassword(password);
		
		if(isValid) {
			System.out.println("Valid password");
		}else {
			System.out.println("Invalid password");
		}
		
		sc.close();

	}
	
	public static boolean validatePassword(String password) {
		if (password.length() < 6) {
			return false;
		}
		
		boolean hasUppercase = false;
		boolean hasLowercase = false;
		boolean hasDigit = false;
		boolean hasSpecialChar = false;
		
		for(int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if(Character.isUpperCase(ch)) {
				hasUppercase = true;
			}else if(Character.isLowerCase(ch)) {
				hasLowercase = true;
			}else if(Character.isDigit(ch)) {
				hasDigit = true;
			}else if("!@#$%^&*()-+".contains(Character.toString(ch))) {
				hasSpecialChar = true;
			}
		}
		
		return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
	}

}
