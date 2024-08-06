package innerclass;

public class UseHuman {

	public static void main(String[] args) {
		
		Human john = new Human("john");
		john.setWear("green", "L");
		System.out.println(john.getWear());
		
	}
}
