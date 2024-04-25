package nums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumZoreFromArray {

	public static void main(String[]args) {
		int[] test = {0,1,1,-1,2,-1};
		int[] test2 = {1,2,-2,-1};
		threeSumN3(test);
	}
	
	//時間複雜度O(n^3)
	public static List<List<Integer>> threeSumN3(int[] data) {
		Set<List<Integer>> seen = new HashSet<>();
		Arrays.sort(data);
		int len = data.length;
		List<List<Integer>> ans = new ArrayList<>();

		if(len<3) {
			return null;
		}
		for(int i=0; i<=len-3; i++) {
			System.out.println("i:"+data[i]);
			for(int j=i+1; j<=len-2; j++) {
				System.out.println("j:"+data[j]);
				for(int k=j+1; k<=len-1; k++) {
					System.out.println("k:"+data[k]);
					if(data[i]+data[j]+data[k] == 0) {
						List<Integer> tmp = new ArrayList<>();
						tmp.add(data[i]);
						tmp.add(data[j]);
						tmp.add(data[k]);
						Collections.sort(tmp);
                        if (!seen.contains(tmp)) {
                        	System.out.println("i:"+data[i]+"j:"+data[j]+"k:"+data[k]);
                            ans.add(tmp);
                            seen.add(tmp);
                        }
					}
				}
			}
		}
		return  ans;
	}
	
	//O(n^2) 用雙指標法
	public static List<List<Integer>> threeSumN2(int[] data) {
        Arrays.sort(data);
        int len = data.length;
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int i = 0; i < len - 2; i++) {
            //重複的i就不做了
            if (i > 0 && data[i] == data[i - 1]) {
                continue;
            }
            
            int left = i + 1;
            int right = len - 1;
            
            while (left < right) {
                int sum = data[i] + data[left] + data[right];
                
                if (sum == 0) {
                    ans.add(Arrays.asList(data[i], data[left], data[right]));
                    while (left < right && data[left] == data[left + 1]) {
                        left++;
                    }
                    while (left < right && data[right] == data[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
}
