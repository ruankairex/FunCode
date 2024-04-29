package string_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowelString {
	public static void main(String[]args) {
		String input = "Aa";
		String ans = reverseVowels(input);
		System.out.println(ans);
	}
	
	//我的第一次嘗試
	public static String reverseVowels(String input) {
		char[] chars = input.toCharArray();
		List<Character> role = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		int left = 0;
		int right = input.length()-1;
		
		while(left<right) {
			if(role.contains(chars[left])) {
				if(role.contains(chars[right])) {
					char tmp = chars[left];
					chars[left] = chars[right];
					chars[right] = tmp;
					left ++;
					right --;
				}else {
					right --;
				}
			}else {
				left ++;
			}
		}
		return new String(chars);	
	}
	
	//極致效率
	public String reverseVowels2(String s) {

        char[] chars = s.toCharArray();
        int start = 0 ;
        int end = s.length()-1;
        while (start<end){
            while (start<end && !isVowel(chars[start])) {
                start++;
            }
            while (start<end && !isVowel(chars[end])) {
                end--;
            }
                swap(chars, start, end);
                start++;
                end--;
        }
        return new String(chars);
    }

    private void swap(char[] word, int start, int end){
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
	
}
