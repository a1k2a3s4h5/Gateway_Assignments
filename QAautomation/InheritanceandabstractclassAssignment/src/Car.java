
public class Car extends Vehical {
       String brandName;
       String engineType;
       int personCapacity;
       String fualType;
       String color;
       Car(String vehicalType,int numberOfWheels,String brandName,String engineType,int personCapacity,String fualType,String color) {
    	   super(vehicalType,numberOfWheels);
    	   this.brandName = brandName;
    	   this.engineType = engineType;
    	   this.personCapacity = personCapacity;
    	   this.fualType = fualType;
    	   this.color = color;   
       }
       public void vehicalDetails() {
    	 System.out.println("Your Vehical type is : "+ vehicalType);
      	 System.out.println("Your Vehical has "+numberOfWheels+" numbers of wheels.");
      	 System.out.println("Brand name of car is "+ brandName);
      	 System.out.println("Engine type of car is "+ engineType);
      	 System.out.println("Fual type of car is "+ fualType);
      	 System.out.println("Color of car is "+ color);
       }
       
       public int price(int showRoomPrice , int insurance , int roadTax , int accessories ,int deliveryCharge) {
    	int onRoad;
    	onRoad= showRoomPrice+insurance+roadTax+accessories+deliveryCharge;   
		return onRoad;
	   }
       
       public void startEngine() {
    	System.out.println("Car has started.");
       }
       
       public void stopEngine() {
    	System.out.println("Car has stopped.");   
       }
}
