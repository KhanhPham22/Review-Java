package other;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		String [] rps = {"Rock", "Paper", "Scissors"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you chose (Rock,Paper,Scissors):");
		String userChoice = sc.nextLine();
		
		Random random = new Random();
		int randomIndex = random.nextInt(3);
		String computerChoice = rps[randomIndex];
		
		System.out.println("Computer choice" + computerChoice);
		
		if(userChoice.equalsIgnoreCase(computerChoice)) {
			System.out.println("Is a draw!");
		} else if(userChoice.equalsIgnoreCase("Rock")&& computerChoice.equals("Scissors")||
				  userChoice.equalsIgnoreCase("Paper")&& computerChoice.equals("Rock") ||
				  userChoice.equalsIgnoreCase("Scissors")&& computerChoice.equals("Paper")) {
			System.out.println("You win");
		} else {
			System.out.println("You lose");
		}
			sc.close();
	}

}
