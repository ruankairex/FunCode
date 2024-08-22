package lambda_learning;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> greet = s -> System.out.print("hello, "+s);
		Consumer<String> exclaim = s -> System.out.println("!");
		Consumer<String> conbined = greet.andThen(exclaim);
		
		conbined.accept("John");
	}
	
}
