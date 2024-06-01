package nums;

import java.util.PriorityQueue;

//leetcode第786題
//給一數列，運算後找出前k個最小值
public class KthSmallest {
	public static void main(String[]args) {
		int[] data = {1,2,3,5};
		int[] ans = kthSmallestPrimeFraction(data,3);
		for(int a:ans) {
			System.out.println(a);
		}
	}
	
	public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
		int len = arr.length;
		
		
		//實作比較器
		PriorityQueue<int[]> qq = new PriorityQueue<>((a,b)->
       								Integer.compare(arr[a[0]]*arr[b[1]], arr[a[1]]*arr[b[0]]));
		
		//初始化
		for(int i=0; i<len-1; i++) {
			qq.add(new int[] {i,len-1});
		}
		
		
		//動態比較
		for(int i=1; i<k; i++) {
			int[] tmp = qq.poll();
			int numeratorIndex = tmp[0];
			int denominatorIndex = tmp[1];
			if(denominatorIndex-1 > numeratorIndex) {
				qq.add(new int[] {numeratorIndex,denominatorIndex-1});
			}
		}
		
		
		//抓出要輸出的index
		int[] re = qq.poll();
		
		
		//轉換成真值
		return new int[] {arr[re[0]],arr[re[1]]};
    }

}
