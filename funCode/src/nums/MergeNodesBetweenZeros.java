package nums;

public class MergeNodesBetweenZeros {
	public static void main(String[] args) {
		ListNode head = new ListNode(0,
										new ListNode(3,
												new ListNode(1,
														new ListNode(0,
																new ListNode(4,
																		new ListNode(5,
																				new ListNode(2,
																						new ListNode(0))))))));
		ListNode ans = mergeNodes(head);
		while(ans.next != null) {
			System.out.println(ans.val);
			ans = ans.next;
		}
		System.out.println(ans.val);
	
	}
	
	public static ListNode mergeNodes(ListNode head) {
		
		ListNode tmp = head.next;
		ListNode innerTmp = tmp;
		
		while(innerTmp != null) {
			int sum = 0;
			while(innerTmp.val != 0) {
				System.out.println(innerTmp.val);
				sum += innerTmp.val;
				innerTmp = innerTmp.next;
			}
			System.out.println(sum);
			tmp.val = sum;
			innerTmp = innerTmp.next;
			tmp.next = innerTmp;
			tmp = tmp.next;
		}
		return head.next;
    }
	
	static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
}
