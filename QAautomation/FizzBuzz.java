import java.util.Scanner;

public class FizzBuzz {
	/* here this program askes user input to provide his/her first name or last name or both and it breaks when he/she will get 
	 * full name. give his/her first name if given number is divisible by 3 , give his/her last name if number is divisible by 
	 * 5 , give full name and exit if number is divisible by both 3 & 5.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String FirstName = "Akash"; //initialize first name
        String LastName = "Patel"; //initialize last name
        while(true) {
      	  System.out.println("Enter Your Number : "); //ask user to enter number
      	  Scanner s = new Scanner(System.in);//initialize object of scanner class
      	  int number = s.nextInt();//user will enter input
      	  if((number%5 == 0) && (number%3 == 0)){ //check weather number is divisible by 3 & 5 or not
      		  System.out.println("Your First name and Last name is "+ FirstName + " " + LastName);
      		  break; //here we will out from loop
      	  }
      	  if(number%3 == 0) { //check weather number is divisible by 3 or not
      		  System.out.println("Your First name is "+ FirstName);
      	  }
      	  if(number%5 == 0){ //check weather number is divisible by 5 or not
      		  System.out.println("Your Last name is "+ LastName);
      	  }
      	  else {
      		  System.out.println("Please Enter Correct Number.");
      	  }
      	  
        }
	}

}
