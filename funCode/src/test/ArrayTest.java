package test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayTest {
	public static void main(String[] args) {
		Integer[] diceRoll = {1,2,3,4,5,6,7,8,9};
	      //using aslist() method
		List<Integer> diceRollList = Arrays.asList(diceRoll);
		System.out.println(diceRollList);

		// using getters and setters to randomly access the list
		diceRollList.set(5, 999);
		diceRollList.set(0, 111);

		foreach(diceRollList);

		
		
	   }
	static void foreach(Iterable<Integer> iterable) {
		Iterator<Integer> itor = iterable.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
	}
}

