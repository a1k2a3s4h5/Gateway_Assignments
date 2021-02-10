import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
/* here first compiler guess the value and then user have to match with that value within 10 interval and if he will get success
 *then system asks that he want to play again or not if he want to play than this process will restart and if not than exit. 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random range = new Random(); //initialize random class object
		   int max = 100; //initialize Max Variable
		   int min =1; //initialize Min Variable
		   int i = 0;
		   int k;
		   int uservalue;//define userinput variable as uservalue
		   do {
         int a = range.nextInt(max - min) + min; //take random input between 1 to 100 from compiler
         //System.out.println("Comipler guess value of a is " + a);
         Scanner s = new Scanner(System.in); //initialize scanner class object
         for(i = 0 ; i<10 ; i++ ) { //iterate for at least 10 time to match with compiler's result
      	   System.out.println("Please enter your value : ");
      	   uservalue = s.nextInt(); //taking user value input
      	   if(uservalue == a) { //check if both are same or not
      		   System.out.println("You guess as same as compiler.");
      		   System.out.println("You guess on "+ (i+1)+" trial.");
      		   break; //here we will out from loop
      	   }
      	   else {
      		  
      		  if(uservalue>a) { //check if uservalue is greater than a or not
      			  System.out.println("Uservalue is higher than compiler value by amount.");
      			  System.out.println("You are on "+ (i+1)+" trial.");
      		  }
      		  else {
      			  System.out.println("Uservalue is lower than compiler value by amount.");
      			  System.out.println("You are on "+ (i+1)+" trial.");
      		  }
      	   }
      	   
         }
         System.out.println("Your 10 trial is over do you want to continue with different value or leave this game?? for yes enter 1 and for leave enter 0 \n Please enter YES/NO: ");
         k = s.nextInt(2);
		   }while(k==1);
		   System.out.println("You are done with this game pleas exit it.");
	}

	}


