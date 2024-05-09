package nums;

import java.util.Arrays;

//對int[]做排序，找前k個，並且每找一個則其他均減1
public class MaximizeHappiness {
	public static void main(String[]args) {
		int[] data = {3,7,4,1,0};
		long ans = maximumHappinessSum(data,3);
		System.out.println(ans);
	}
	
	public static long maximumHappinessSum(int[] happiness, int k) {
		Arrays.sort(happiness);
		long re = 0;
		int len = happiness.length;
		int minus = 0;
		for(int i=len-1; i>=len-k; i--) {
			re += Math.max(happiness[i] - minus++,0);
		}
	
        return re;
		
		
	}
}
