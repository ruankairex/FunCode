package sort_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class SortChar {
	public static void main(String[]args) {
		char[] chars= {'v','e','a','r','s','s','o'};
		sortChar(chars);
	}
	
	public static void sortChar(char[] lis) {
		//字串統計後排序
		Map<Character,Integer> charMap = new HashMap<>();
		
	
		for(char c:lis) {
			charMap.put(c, charMap.getOrDefault(c, 0) + 1);
		}
		
		List<Map.Entry<Character,Integer>> list = new LinkedList<>(charMap.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>(){
			@Override
			public int compare(Map.Entry<Character,Integer> o1, Map.Entry<Character,Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		System.out.println(list);
		
		//字串排序
//		 int n = lis.length;
//	        for (int i = 0; i < n - 1; i++) {
//	            for (int j = 0; j < n - i - 1; j++) {
//	                if (lis[j] > lis[j + 1]) {
//	                    char temp = lis[j];
//	                    lis[j] = lis[j + 1];
//	                    lis[j + 1] = temp;
//	                }
//	            }
//	        }
//	        for (char c : lis) {
//	            System.out.print(c + " ");
//	        }
//	        System.out.println();
	}
}
