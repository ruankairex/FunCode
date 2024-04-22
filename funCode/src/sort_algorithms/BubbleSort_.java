package sort_algorithms;

//氣泡排序法
//排序速度 O(n^2)，巢狀迴圈

public class BubbleSort_ {
	
	public static void main(String[]args) {
		Integer[] data = {9,8,76,4,2,2,1,99};
		bubSort(data);
	}
	
	public static void bubSort(Integer[] data) {
		int len = data.length;
		int tmp;
		
		//排序要做長度-1次
		for(int j=0; j<len; j++) {
			//遍歷每個元素
			for(int i=0; i<len-1; i++) {
				if(data[i]>data[i+1]) {
					tmp = data[i+1];
					data[i+1] = data[i];
					data[i] = tmp;
				}
			}
		}
		
		// 輸出
		for(int i=0; i<len; i++) {
			System.out.println(data[i]);
		}
		
	}
}
