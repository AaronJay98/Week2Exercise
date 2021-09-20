package Week3;

import java.util.Scanner;

public class ExerciseOne {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int min = 0;
		int max = 10; 
		int randomNumber = getRandNum(min, max);
		while(!checkGuess(getGuess(min,max,scan),randomNumber)) {}
		scan.close(); 
	}

	private static int getRandNum(int min, int max) {
		return (int)(Math.random()*(max-min+1))+min;
	}

	private static int getGuess(int min, int max, Scanner scan) {
		System.out.println("Guess a number between "+min+" and "+max);
		
		while(!scan.hasNextInt()) {
			scan.nextLine(); 
			System.out.println("That's not a number.");
			System.out.println("Guess again.");
		}
		
		return scan.nextInt();  
	}
	
	private static boolean checkGuess(int guess, int target) {
		if(guess > target) {
			System.out.println("Too High");
			return false;
		}
		
		else if(guess < target) {
			System.out.println("Too Low");
			return false; 
		}
		else {
			System.out.println("You got it!");
			return true; 
		}
	}
}
