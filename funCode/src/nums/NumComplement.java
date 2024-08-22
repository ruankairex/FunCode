package nums;

public class NumComplement {

	public static void main(String[] args) {
		int ans = findComplement(0);
		System.out.println(ans);
	}
	
	public static int findComplement(int num) {
//		if(num == 0 ) return 1;
		
		int biNumlen = Integer.toBinaryString(num).length();
		int mask = (1 << biNumlen)  -1;
		System.out.println("mask="+mask);
		
		
		return mask^num;
	}
}


