package nums;

public class PassPillow {

	public static void main(String[] args) {
		int ans = passThePillow(3,2);
		System.out.println(ans);
	}
	
	public static int passThePillow(int n, int time) {
        int quotient = time/(n-1);
        int remainder = time%(n-1);
        // 若是偶數
        if(quotient%2 == 0) {
        	System.out.println("偶數");
        	return remainder+1;
        }else {
        	System.out.println("奇數");
        	return n-remainder;
        }
    }
	
}

