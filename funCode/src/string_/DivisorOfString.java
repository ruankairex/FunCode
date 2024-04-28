package string_;


// 兩個Sring a,b  找出a是否可以被b整除，a=b+b+b...。
//e.g.  a="abcabc" b="abc" output="abc"
// hint 最大公因數，輾轉相除法
public class DivisorOfString {
	public static void main(String[]args) {
		System.out.println(diviString("abcabc","ab"));
	}
	
	public static String diviString(String a, String b) {
		String ans ="";
		if(!(a+b).equals(b+a)) {
			return null;
		}
		
		int gcdNum = getGcd(a.length(),b.length());
		
		
				
		return a.substring(0,gcdNum);	
	}
	
	private static int getGcd(int a, int b) {
		return (b==0)?a:getGcd(b,a%b);
	}
}
