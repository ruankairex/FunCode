package binarySearchAlgorithms;

import java.util.Arrays;

public class MagneticForceBetweenTwo {
	public static void main(String[] args) {
		int[] position = {1,2,3,4,7};
		int[] t2 = {5,4,3,2,1,10000};
		int m=3;
		int m2=2;
		int ans = maxDistance(t2,m2);
		System.out.println(ans);
	}
	
	
	public static int maxDistance(int[] position, int m) {
		Arrays.sort(position);
		int lo = 1;
		int hi = (position[position.length-1]-position[0])/(m-1);
		System.out.println(hi);
		int ans = 1;
		while(lo<=hi) {
			int mid = lo+(hi-lo)/2;
			System.out.println(mid);
			if(canWePlace(position,mid,m)) {
				ans = mid;
				lo = mid+1;
				System.out.println("ans"+ans);
			}else {
				hi = mid -1;
			}
		}
		
		return ans;
    }


	private static boolean canWePlace(int[] position, int dist, int cows) {
		int cntCows=1;
		int last = position[0];
		
		for(int i=0; i<position.length; i++) {
			if(position[i] - last >= dist) {
				cntCows++;
				last = position[i];
			}
			if(cntCows >= cows) {
				return true;
			}
		}
		return false;
	}
}
