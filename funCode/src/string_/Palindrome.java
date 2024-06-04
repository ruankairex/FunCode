package string_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Palindrome:回文，前面開始跟後面開始是一樣的
public class Palindrome {
	public static void main(String[]arg) {
		String data = "abccccdd";
		longestPalindrome2(data);
	}
	
	//法一:用Map
	public static int longestPalindrome(String s) {
		Map<Character,Integer> map = new HashMap<>();
		int len = 0;
		boolean odd = false;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c,0)+1);
		}
		
		for(int count : map.values()) {
			if(count%2 == 0) {
				len += count;
			}else {
				len += count-1;
				odd = true;
			}
		}
		
		if(odd) {
			len+=1;
		}
		System.out.println(len);
		return len;	
	}
	
	//法二:用Set
	public static int longestPalindrome2(String s) {
		Set<Character> set = new HashSet<>();
		int len = 0;
		
		for(char c: s.toCharArray()) {
			if(set.contains(c)) {
				set.remove(c);
				len+=2;
			}else {
				set.add(c);
			}
		}
		if(!set.isEmpty()) {
			len+=1;
		}
		System.out.println(len);
		return len;
	}
}
