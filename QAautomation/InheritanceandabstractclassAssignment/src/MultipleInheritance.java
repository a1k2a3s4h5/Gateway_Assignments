
public class MultipleInheritance implements Human , Mutant{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Human obj = new MultipleInheritance();
		MultipleInheritance obj = new MultipleInheritance();
		obj.humanDetails("Akash Patel", "Q.A");
		Mutant.mutantDetails("Thor","His hammer", "Asgard");
		obj.personalityDetails("Hammering");
	}

	@Override
	public void personalityDetails(String personality) {
		// TODO Auto-generated method stub
		System.out.println("Mutant has "+ personality +" personality.");
	}

}
