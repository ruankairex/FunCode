package string_;

//兩個String要合併，
//e.g.  a="abc" , b="efg" ans="aebfcg"
public class MergeString {
	public static void main(String[]args) {
		String ans = mergeString("abc", "ggg");
		System.out.println(ans);
	}
	
	
	public static String mergeString(String a, String b) {
		StringBuilder ans = new StringBuilder();
		int a_len = a.length();
		int b_len = b.length();
		int index = 0;
		
		while(index<a_len || index<b_len) {
			if(index<a_len) {
				ans.append(a.charAt(index));
			}
			if(index<b_len) {
				ans.append(b.charAt(index));
			}
			index++;
		}
		
		
		
		
		return ans.toString();
	}
}
