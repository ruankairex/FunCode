package leetcodemedium;

public class medium2326SpiralMatrix {

	
	public static void main(String[] args) {
		
		
	}
	
	
	public static int[][] spiralMatrix(int m, int n, ListNode head) {
        
		ListNode curr = head;
		int top = 0;
		int botton = m-1;
		int left = 0;
		int right = n-1;
		
		int[][]ans = new int[m][n];
		for(int i=0; i<m ; i++) {
			for(int j=0 ; j<n ; j++) {
				ans[i][j]=-1;	
			}
		}
		
		while(curr != null && top<=botton && left<=right) {
			
			// 左到右
			for(int i=left; i<=right && curr != null; i++) {
				ans[top][i] = curr.val;
				curr = curr.next;
			}
			top++;
			
			// 上到下
			for(int i=top; i<=botton && curr != null; i++) {
				ans[i][right]=curr.val;
				curr = curr.next;
			}
			right--;
			
			// 右到左
			for(int i=right; i>=left && curr != null; i--) {
				ans[botton][i]=curr.val;
				curr = curr.next;
			}
			botton--;
			
			// 下到上
			for(int i=botton; i>=top && curr != null; i--) {
				ans[i][left]= curr.val;
				curr = curr.next;
			}
			left++;
		}
		
		return ans;
    }
	
	 
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	 
}
