package nums;

//找到第n項的數字
//1,1,2,3,5,8,13,21,34...
public class Fibonacci {
	
	public static void main(String[] args) {
		System.out.println(findFibonacciNnum(9));
		for(int i :findFibonacciList(9)) {
			System.out.println(i);
		}
		
	}
	
	public static int findFibonacciNnum(int n) {
		int a1=1;
		int b1=1;
		int tmp;
		if(n<2) {
			return 1;
		}
		for(int i=0; i<n-2; i++) {		
			tmp = a1;
			a1 = a1+b1;
			b1 = tmp;
		}
		return a1;
	}
	
	
	public static int[] findFibonacciList(int n) {
        if (n <= 0) {
            return null;
        } else if (n == 1) {
        	int[] re = {1};
            return re;
        }

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }
}
