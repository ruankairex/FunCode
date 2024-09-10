package leetcodemedium;

import java.util.ArrayList;
import java.util.List;

public class Medium17LetterCom {
	
	public static void main(String[] args) {
		String ques = "23";
		letterCombinations(ques).forEach(System.out::println);
	}
	
	public static List<String> letterCombinations(String digits) {
		List<String> ans = new ArrayList<>(); 
		if(digits == null || digits.length()==0) {
			return ans;
		}
        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        // 遞迴本體
        f(mapping, digits, "", 0, ans);
        
        return ans;
    }
	
	private static List<String> f(String[] mapping, String digits,String current, int index, List<String> ans){
		if(index == digits.length()) {
			ans.add(current);
			return ans;
		}
		String letters = mapping[digits.charAt(index)-'0'];
		for(int i=0; i<letters.length(); i++) {
			f(mapping, digits, current+letters.charAt(i), index+1, ans);
		}
		return ans;
	}
	
	
}
