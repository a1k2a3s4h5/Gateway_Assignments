import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	/**
	 * here first compiler guess the value and then user have to match with that
	 * value within 10 interval and if he will get success then system asks that he
	 * want to play again or not if he want to play than this process will restart
	 * and if not than exit. Created By :Akash Patel Created on:8-02-2021 Updated
	 * on:Version 2 10-02-2021 Updated on:Version 3 15-02-2021 Version 3 16-02-2021
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random range = new Random();
		int maxInput = 100;
		int minInput = 1;
		boolean getValue;
		String playAgainValue;

		do {
			int computerValue = range.nextInt(maxInput - minInput) + minInput;
			System.out.println("Enter value1 and value2 between 1 to 100.");
			System.out.println("Sum of your values is compared with computer values so enter your value accordingly..\n");
			Scanner s = new Scanner(System.in);
			getValue = compareNumber(computerValue);
			if(getValue) {
				System.out.println("Your 10 trials are over.");
				System.out.println("Do you want to start again?? Yes / No : ");
				playAgainValue = s.next();
			}else {
				System.out.println("You won the game.");
				System.out.println("Do you want to play again?? Yes / No : ");
				playAgainValue = s.next();
			}
			
		} while (playAgainValue.equalsIgnoreCase("y"));
		System.out.println("You are done with this game pleas exit it.");
	}

	static boolean compareNumber(int computerValue) {
		int trials = 0;
		int userValue1;
		int userValue2;
		int sumOfUserInput;
		boolean value = false;
		System.out.println(computerValue);
		Scanner s = new Scanner(System.in);
		for (trials = 0; trials < 10; trials++) {

			System.out.println("Please enter your value 1 : ");
			userValue1 = s.nextInt();
			System.out.println("Please enter your value 2 : ");
			userValue2 = s.nextInt();
			sumOfUserInput = userValue1 + userValue2;
			System.out.println("Sum of your values : " + sumOfUserInput);
			if (sumOfUserInput > 100 || sumOfUserInput < 0) {
				System.out.println("Enter valid input. You are on " + (trials + 1) + " trial.");
			} else if (sumOfUserInput == computerValue) {
				System.out.println("You guess as same as compiler.");
				System.out.println("You guess on " + (trials + 1) + " trial.");
				break;
			} else if (sumOfUserInput > computerValue) {
				System.out.println("Sum of both values are higher than compiler value.");
				System.out.println("You are on " + (trials + 1) + " trial.");
			} else {
				System.out.println("Sum of both values are lower than compiler value.");
				System.out.println("You are on " + (trials + 1) + " trial.");
			}
			value = true;
		}
		return value;
		/*if (value) {
			System.out.println("Your 10 trials are over.");
		}*/

	}

}
