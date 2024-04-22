package sort_algorithms;

//雞尾酒排序
//O(n^2)，看運氣，最好可以O(n)，用Bubble不如用Cocktail
public class CocktailSort_ {
	public static void main(String[]args) {
		Integer[] data = {9,8,76,4,2,2,1,99};
		cocktailSort_(data);
	}
	
	public static void cocktailSort_(Integer[] data) {
		int left = 0;
		int right = data.length-1;
		int tmp;
		boolean isChange = true;
		
		while(isChange) {
			isChange = false;
			//往右排序 0 -> len
			for(int i=left; i<right; i++) {
				if(data[i]>data[i+1]) {
					tmp = data[i+1];
					data[i+1] = data[i];
					data[i] = tmp;
					isChange = true;
				}
			}
			right--;
			//往左排序 len -> 0
			for(int i=right; i>left; i--) {
				if(data[i]<data[i-1]) {
					tmp = data[i-1];
					data[i-1] = data[i];
					data[i] = tmp;
					isChange = true;
				}
			}
			left++;
		}
		// 輸出
			for(int i=0; i<data.length; i++) {
				System.out.println(data[i]);
			}
	}
}
