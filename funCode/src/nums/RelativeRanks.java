package nums;

import java.util.Arrays;
import java.util.Collections;

public class RelativeRanks {
	public static void main(String[]args) {
		int[] data = {2,50,32,12,9};
		String[] ans =relativeRanks(data);
		for(String s:ans) {
			System.out.println(s);
		}
	}
	
	//使用二維陣列
	public static String[] relativeRanks(int[] data) {
		int len = data.length;
		String[] ans = new String[len];
		int[][] intPairs = new int[len][2]; 
		
		for(int i=0; i<len; i++) intPairs[i]= new int[] {i,data[i]};
		
		Arrays.sort(intPairs,(x,y)->-(x[1]-y[1]));
		
		for(int i=0; i<len; i++) {
			if(i == 0) {
				ans[intPairs[i][0]] = "Gold Medal";
			}else if(i == 1) {
				ans[intPairs[i][0]] = "Silver Medal";
			}else if(i == 2) {
				ans[intPairs[i][0]] = "Bronze Medal";
			}else {
				ans[intPairs[i][0]] = String.valueOf(i+1);
			}
		}
		
		return ans;
		
	}

}
