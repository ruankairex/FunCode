package leetcodeeasy;

public class easy1945SumOfDigiOfString {
	public static void main(String[] args) {
		
	}
	
	public static int getLucky(String s, int k) {
		StringBuilder number = new StringBuilder();
		
		for(char a : s.toCharArray()) {
			number.append(a-'a'+1);
		}
		
		while(k>0) {
			int tmp = 0;
			for(char x : number.toString().toCharArray()) {
				tmp += x - '0';
			}
			number = new StringBuilder(String.valueOf(tmp));
			k--;
		}
		return Integer.parseInt(number.toString());
    }
}
