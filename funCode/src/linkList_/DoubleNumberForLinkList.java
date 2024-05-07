package linkList_;


//有一個linklist，把它乘二後一樣輸出乘linklist
//e.g. 1,8,9  輸出  3,7,8
public class DoubleNumberForLinkList {
	public static void main(String[]args) {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(8);
		ListNode a3 = new ListNode(9);
		a1.next=a2;
		a2.next=a3;
		
		ListNode ans = doubleIt(a1);
		while(ans!=null) {
			System.out.println(ans.val);
			ans=ans.next;
		}
		
	}
	
	//有捷徑，任何東西乘2只有0,2,4,6,8，進位不可能影響到前面兩位
	//Beats 80.87% of users with Java
	public static ListNode doubleIt(ListNode head) {
		//這是頭
		ListNode preNode = new ListNode(0);
		//這是變動指標(preNode)
		ListNode index = preNode;
		//這是當下指標
		ListNode tmp = head;
		
		while(tmp!=null) {
			int val = tmp.val*2;
			if(val/10 > 0) {
				index.val+=1;
			}
			ListNode output = new ListNode(val%10);
			index.next=output;
			index = index.next;
			tmp = tmp.next;
		}
		if(preNode.val==0) {
			return preNode.next;
		}
		return preNode;
	}
	

	
	
	
	
}

class ListNode {
	 int val;
	 ListNode next;
	 ListNode() {}
	 ListNode(int val) { this.val = val; }
	 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
