package innerclass;

public class OuterDemo2 {

	//instance method of the outer class OuterDemo2
	   void myMethod() {
	       String str = "and it's a value from OuterDemo2 class' myMethod ";

	       // method-local inner class
	       class methodInnerDemo {
	           public void print() {
	               System.out.println("Here we've got a method inner class... " );
	               System.out.println(str);

	           }
	       }
	       // Access to the inner class
	       methodInnerDemo inn = new methodInnerDemo();
	       inn.print();
	   }
}
