
public interface Human {
	default void humanDetails(String name , String skills) {
	   System.out.println("Human name is "+ name);
	   System.out.println("Human is having skills like "+ skills);
    }
}
