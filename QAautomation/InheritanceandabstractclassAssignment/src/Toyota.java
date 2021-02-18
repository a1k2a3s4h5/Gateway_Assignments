import java.util.Scanner;

public class Toyota extends Car {
	int currentSpeed;
	int gear;
	boolean breakApply = false;

	public Toyota(String vehicalType, int numberOfWheels, String brandName, String engineType, int personCapacity,
			String fualType, String color) {
		super(vehicalType, numberOfWheels, brandName, engineType, personCapacity, fualType, color);
	}

	public void vehicalDetails() {
		// super.vehicalDetails();
		System.out.println("Your Vehical type is : " + vehicalType);
		System.out.println("Your Vehical has " + numberOfWheels + " numbers of Wheels.");
		System.out.println("Brand name of car is " + brandName);
		System.out.println("Engine type of car is " + engineType);
		System.out.println("Fual type of car is " + fualType);
		System.out.println("Color of car is " + color);

	}

	public void drive(int gear, int currentSpeed) {
		//Scanner forInput = new Scanner(System.in);
		if (gear == 1) {
			if (currentSpeed <= 10) {
				System.out.println("Your current speed is " + currentSpeed + " kms.");
				System.out.println("You can now max increase your speed up to 10kms as 1st gear is loaded.");
				if (currentSpeed == 10) {
					System.out.println("you can change gear to 2.");
				}
			} else
				System.out.println(
						"Please reduce speed to 10kms and then change gear if you want long term support from engine else change gear without any speed reducement.");

		} else if (gear == 2) {
			if (currentSpeed <= 40) {
				System.out.println("Your current speed is " + currentSpeed + " kms.");
				System.out
						.println("You can now max increase your speed up to " + 40 + " kms as gear has switched to 2.");
				if (currentSpeed == 40) {
					System.out.println("you can change gear to 3.");
				}
			} else
				System.out.println(
						"Please reduce speed to 40kms and then change gear if you want long term support from engine else change gear without any speed reducement.");

		} else if (gear == 3) {
			if (currentSpeed <= 70) {
				System.out.println("Your current speed is " + currentSpeed + " kms.");
				System.out
						.println("You can now max increase your speed up to " + 70 + " kms as gear has switched to 3.");
				if (currentSpeed == 70) {
					System.out.println("you can change gear to 4.");
				}
			} else
				System.out.println(
						"Please reduce speed to 70kms and then change gear if you want long term support from engine else change gear without any speed reducement.");
		} else if (gear == 4) {
			if (currentSpeed <= 100) {
				System.out.println("Your current speed is " + currentSpeed + " kms.");
				System.out.println(
						"You can now max increase your speed up to " + 100 + " kms as gear has switched to 4.");
				if (currentSpeed == 100) {
					System.out.println("you can change gear to 5.");
				}
			}

			else
				System.out.println(
						"Please reduce speed to 100kms and then change gear if you want long term support from engine else change gear without any speed reducement.");
		} else if (gear == 5) {
			if (currentSpeed <= 130) {
				System.out.println("Your current speed is " + currentSpeed + " kms.");
				System.out
						.println("You can now max increase your speed up to " + 130 + " kms as gear has switched to 5");
				if (currentSpeed == 130) {
					System.out.println("You have reached to ur max limit now apply break operations.");
					breakApply = true;
				}
			}

			else
				System.out.println(
						"Please reduce speed to 130kms and then change gear if you want long term support from engine else change gear without any speed reducement.");
		}
	}

	public void breakOfCar(boolean applyBreak, String breakType, int currentSpeed) {
		if (applyBreak) {
			if (breakType.equalsIgnoreCase("hard")) {
				this.currentSpeed = currentSpeed - 35;
				System.out.println("You have applied hard break so your current speed is reduced. \nYour current speed is " + this.currentSpeed + " kms.");
				System.out.println("According current speed your gear is also shift to 4 from 5.");
				this.gear = 4;
			} else if (breakType.equalsIgnoreCase("medium")) {
				this.currentSpeed = currentSpeed - 20;
				System.out.println("You have applied medium break so your current speed is reduced. \nYour current speed is " + this.currentSpeed + " kms.");
				System.out.println("According to your current speed gear is also shift to 3 from 4.");
				this.gear = 3;
			} else if (breakType.equalsIgnoreCase("low")) {
				this.currentSpeed = currentSpeed - 7;
				System.out.println("You have applied low break so your current speed is reduced. \nYour current speed is " + this.currentSpeed + " kms.");
				System.out.println("According to your current speed gear is also shift to 2 from 3.");
				this.gear=2;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Toyota newToyota = new
		 * Toyota("Car",4,"Toyota","Internal Engine",6,"Petrol","White");
		 * newToyota.vehicalDetails(); System.out.println("Price of newToyota car is "+
		 * newToyota.price(1200000, 40000, 35000));
		 * newToyota.currentSpeed=newToyota.drive(1, 0);
		 * newToyota.currentSpeed=newToyota.drive(2, newToyota.currentSpeed);
		 * newToyota.currentSpeed=newToyota.drive(3, newToyota.currentSpeed);
		 * newToyota.currentSpeed=newToyota.drive(4, newToyota.currentSpeed);
		 * newToyota.currentSpeed=newToyota.drive(5, newToyota.currentSpeed);
		 * newToyota.currentSpeed=newToyota.breakOfCar(0, "hard",
		 * newToyota.currentSpeed); newToyota.currentSpeed=newToyota.breakOfCar(0,
		 * "medium", newToyota.currentSpeed);
		 * newToyota.currentSpeed=newToyota.breakOfCar(0, "low",
		 * newToyota.currentSpeed); System.out.
		 * println("After applying all types of break the currentspeed of car is "
		 * +newToyota.currentSpeed); //newToyota.breakOfCar(0, "hard", 90);
		 */

		Scanner forInput = new Scanner(System.in);
		Toyota innova = new Toyota("Laxurious Car", 4, "TOYOTA", "Petrol engine", 8, "Petrol", "Black");
		System.out.println("Detalis of your Toyota car is given below.");
		innova.vehicalDetails();
		System.out.println("The total price of toyota innova car is : "
				+ innova.price(1632000, 50000, 20000, 90000, 2500) + " INR.");
		System.out.println("Now let's drive it.");
		System.out.println("let's start engine.");
		innova.startEngine();
		do {
			System.out.println("Please enter gear.");
			innova.gear = forInput.nextInt(6);
			System.out.println(innova.gear);
			
			System.out.println("Please enter CurrentSpeed.");
			innova.currentSpeed = forInput.nextInt();
			innova.drive(innova.gear, innova.currentSpeed);
			System.out.println(
					"This is the last chance to enter your current speed so please enter according to instructions.");
			System.out.println("Please enter CurrentSpeed.");
			innova.currentSpeed = forInput.nextInt();
			innova.drive(innova.gear, innova.currentSpeed);
			innova.breakOfCar(innova.breakApply,"Hard",innova.currentSpeed);
			System.out.println("After applying hard break car's gear and current speed are : "+innova.gear +" "+innova.currentSpeed);
			innova.breakOfCar(innova.breakApply,"medium",innova.currentSpeed);
			System.out.println("After applying medium break car's gear and current speed are : "+innova.gear +" "+innova.currentSpeed);
			innova.breakOfCar(innova.breakApply,"medium",innova.currentSpeed);
			System.out.println("After applying medium break car's gear and current speed are : "+innova.gear +" "+innova.currentSpeed);
			innova.breakOfCar(innova.breakApply,"medium",innova.currentSpeed);
			System.out.println("After applying medium break car's gear and current speed are : "+innova.gear +" "+innova.currentSpeed);
			innova.breakOfCar(innova.breakApply,"low",innova.currentSpeed);
			System.out.println("After applying low break car's gear and current speed are : "+innova.gear +" "+innova.currentSpeed);
			System.out.println("Now let's stop the car\n.");
			innova.currentSpeed=0;
			System.out.println("Now your current speed is reduced to 0. and hence please down the hand break.");
			System.out.println("Thank you for driving this car.");
		} while (innova.currentSpeed != 0);
	}

}
