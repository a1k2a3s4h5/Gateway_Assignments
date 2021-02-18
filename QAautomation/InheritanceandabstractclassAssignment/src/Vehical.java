
public class Vehical {
     String vehicalType;
     int numberOfWheels;
     Vehical(String vehicalType,int numberOfWheels) {
    	 this.vehicalType=vehicalType;
    	 this.numberOfWheels=numberOfWheels; 
     }
     
     public void vehicalDetails() {
    	 System.out.println("Your Vehical type is : "+ vehicalType);
    	 System.out.println("Your Vehical has "+numberOfWheels+" numbers of wheels.");
     }
     
     public int price(int showRoomPrice , int insurance , int roadTax) {
		return (showRoomPrice + insurance + roadTax);
    	 
     }
}
