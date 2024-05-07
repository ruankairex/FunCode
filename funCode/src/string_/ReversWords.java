package string_;

import java.util.Stack;

//詞反轉，運用stack
public class ReversWords {
	public static void main(String[]args) {
		String input = "this is  hello world";
		System.out.println(reverse(input));
	}
	
	public static String reverse(String data) {
		Stack<StringBuilder> stac = new Stack<>();
		for(int i=0; i<data.length(); i++) {
			StringBuilder tmp =new StringBuilder("");
			while(i<data.length() && data.charAt(i)!=' ') {
				tmp.append(data.charAt(i));
				i++;
			}
			if(tmp.length()>0) {
				stac.push(tmp);
			}
		}
	
		StringBuilder ans = new StringBuilder();
		while(stac.size()>1) {
			ans.append(stac.pop());
			ans.append(" ");
		}
		ans.append(stac.pop());
		
		return ans.toString();
	}
}
