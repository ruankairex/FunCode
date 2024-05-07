package nums;

//參考leetcode 238 Product Of Array Except Self

public class ArrayExceptSelf {
	public static void main(String[]args) {
		int[] data = {1,2,3,4,5};
		int[] output = exceptSelf(data);
		for(int i:output) {
			System.out.println(i);
		}
	}
	
	//我第一次寫的方法
	public static int[] exceptSelf(int[] data) {
		int[] ans = new int[data.length];
		int[] left = new int[data.length];
		int[] right = new int[data.length];
		
		left[0] = 1;
		right[data.length-1] = 1;
		
		for(int i=1; i<=data.length-1; i++) {
			left[i] = left[i-1]*data[i-1];
			right[data.length-i-1] = right[data.length-i]*data[data.length-i];
		}
		
		for(int i=0; i<=data.length-1; i++) {
			ans[i] = left[i]*right[i];
		}
		return ans;
	}
	
	//邏輯大神的寫法 使用right[]跟data[]與單一個int mul，比我的方法省了一個int[]
	public int[] productExceptSelf(int[] data) {
      int[] result = new int[data.length];
      int mul = 1;
      int[] right = new int[data.length];
      for(int i = data.length-1 ; i>=0; i--){
          mul *=  data[i];
          right[i] = mul;
      }
      mul = 1;
      for(int i = 0 ; i < data.length -1; i++){

          result[i] = mul * right[i+1];
          mul *= data[i];

      }
      result[data.length-1] = mul;
      
      return result;
  }
}
