package nums;

import java.util.ArrayList;
import java.util.List;

public class GetExtraNums {
	public static void main(String[] args) {
		int[] test = {7,2,5,6,9,9,4,5}; 
		List<Boolean> ans = checkExtra(test,3);
		for(boolean a:ans) {
			System.out.println(a);
		}
	}
	
	public static List<Boolean> checkExtra(int[] a, int extranums) {
		int a_len =a.length;
		int max = 0;
		List<Boolean> ans = new ArrayList<>();
		//找到最大值
		for(int i:a) {
			if(i>=max) {
				max=i;
			}
		}
		for(int i=0; i<a_len; i++) {
			if((a[i]+extranums)>=max) {
				ans.add(true);
			}else {
				ans.add(false);
			}
		}
		return ans;
	}
}
