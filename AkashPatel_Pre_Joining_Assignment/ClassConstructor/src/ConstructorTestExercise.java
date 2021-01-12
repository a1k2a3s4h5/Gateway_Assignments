public class ConstructorTestExercise {

	public static void main(String[] args) {
		//Use the Car keyword to declare Car Class variable
		Car Toyota = new Car();

		Toyota.iDoors = 4;
		Toyota.iHighestSpeed = 200;
		Toyota.iTyres = 4;
		Toyota.sColor = "Black";
		Toyota.sTransmission = "Manual";
		Toyota.bLeftHandDrive = true;

		//Using Car class method
		Toyota.DisplayCharacterstics();

	}

}
 
class Car {
	//Class Member Variables & Fields
    //Private variables   
    private String sModel;
    private int iMake;
    private int iGear;
    int iHighestSpeed;
    String sColor;
    boolean bLeftHandDrive;
    String sTransmission;
    int iTyres;
    int iDoors;

    //Default values set in Constructor
    public Car(){
    	sModel = "Camry";
    	iMake = 2014;
    	iGear = 5;
    }

    public void DisplayCharacterstics(){
    	System.out.println("Model of the Car: " +  sModel);
    	System.out.println("Number of gears in the Car: " +  iGear);
    	System.out.println("Max speed of the Car: " +  iHighestSpeed);
    	System.out.println("Color of the Car: " +  sColor);
    	System.out.println("Make of the Car: " +  iMake);
    	System.out.println("Transmission of the Car: " +  sTransmission);

    }

}
