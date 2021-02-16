import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	/**
	 * here first compiler guess the value and then user have to match with that
	 * value within 10 interval and if he will get success then system asks that he
	 * want to play again or not if he want to play than this process will restart
	 * and if not than exit. Created By :Akash Patel Created on:8-02-2021 Updated
	 * on:Version 2 10-02-2021 Updated on:Version 3 15-02-2021
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random range = new Random();
		int maxinput = 100;
		int mininput = 1;
		String playagainvalue;

		do {
			int a = range.nextInt(maxinput - mininput) + mininput;
			System.out.println("Enter value1 and value2 between 1 to 100.");
			System.out
					.println("Sum of your values is compared with computer values so enter your value accordingly..\n");
			Scanner s = new Scanner(System.in);
			CompareNumber(a);
			System.out.println("Do you want to play again?? Yes / No : ");
			playagainvalue = s.next();

		} while (playagainvalue.equalsIgnoreCase("y"));
		System.out.println("You are done with this game pleas exit it.");
	}

	static void CompareNumber(int a) {
		int i = 0;
		int uservalue1;
		int uservalue2;
		int Sumofuserinput;
		boolean value = false;
		System.out.println(a);
		Scanner s = new Scanner(System.in);
		for (i = 0; i < 10; i++) {

			System.out.println("Please enter your value 1 : ");
			uservalue1 = s.nextInt();
			System.out.println("Please enter your value 2 : ");
			uservalue2 = s.nextInt();
			Sumofuserinput = uservalue1 + uservalue2;
			System.out.println("Sum of your values : " + Sumofuserinput);
			if (Sumofuserinput > 100) {
				System.out.println("Enter valid input. You are on " + (i + 1) + " trial.");
			} else if (Sumofuserinput < 0) {
				System.out.println("Enter valid input. You are on " + (i + 1) + " trial.");
			} else if (Sumofuserinput == a) {
				System.out.println("You guess as same as compiler.");
				System.out.println("You guess on " + (i + 1) + " trial.");
				break;
			} else if (Sumofuserinput > a) {
				System.out.println("Sum of both values are higher than compiler value.");
				System.out.println("You are on " + (i + 1) + " trial.");
			} else {
				System.out.println("Sum of both values are lower than compiler value.");
				System.out.println("You are on " + (i + 1) + " trial.");
			}
			value = true;
		}
		if (value) {
			System.out.println("Your 10 trials are over.");
		}

	}

}
