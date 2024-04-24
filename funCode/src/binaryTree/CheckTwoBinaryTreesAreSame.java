package binaryTree;

public class CheckTwoBinaryTreesAreSame {

	public static void main(String[] args) {
		TreeNode a = new TreeNode(2);
		TreeNode b = new TreeNode(3);
		TreeNode c = new TreeNode(4,a,b);
		TreeNode d = new TreeNode(2);
		TreeNode e = new TreeNode(3);
		TreeNode f = new TreeNode(4,d,e);
		
		boolean ans = isSameTree(c,f);
		System.out.println(ans);
		
	}
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null && q==null) {
			return true;
		}
		if(p==null || q==null) {
			return false;
		}
		if(p.val != q.val) {
			return false;
		}
		
		return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
	}
	
}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(){};
	TreeNode(int val){
		this.val=val;
	}
	TreeNode(int val,TreeNode left, TreeNode right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	

}
