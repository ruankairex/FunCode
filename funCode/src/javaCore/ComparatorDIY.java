package javaCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComparatorDIY {
	public static void main(String[]args) {
		List<Character> words = Arrays.asList('a','g','d','t','f','q');
		//words.sort(new StringComparator());
		List<Character> output1 = new ArrayList<>();
		Map<Integer,Character> output2 = new HashMap<>();
		
		Collections.sort(words,new StringComparator());
		
		for(int i=0; i<words.size(); i++) {
			Character tmp = words.get(i);
			output1.add(tmp);
			output2.put(i, tmp);
		}
		System.out.println(output1);
		System.out.println();
		System.out.println(output2);
	}
}

class StringComparator implements Comparator<Character>{

	@Override
	public int compare(Character o1, Character o2) {
		// TODO Auto-generated method stub
		System.out.println(-o1.compareTo(o2));
		return -o1.compareTo(o2);
	}
	
}
