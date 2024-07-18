package bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NemberOfGoodLeafPairs {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		TreeNode t7 = new TreeNode(7);
		
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		
		int ans = countPairs(t1, 2);
		System.out.println(ans);
		
	}
	
	public static int countPairs(TreeNode root, int distance) {
        Map<TreeNode, List<TreeNode>> map = new HashMap<>();
        List<TreeNode> leaves = new ArrayList<>();
        findLeaves(root, new ArrayList<>(), leaves, map);
        int res = 0;
        for (int i = 0; i < leaves.size(); i++) {
            for (int j = i + 1; j < leaves.size(); j++) {
                List<TreeNode> list_i = map.get(leaves.get(i));
                List<TreeNode> list_j = map.get(leaves.get(j));
                for (int k = 0; k < Math.min(list_i.size(), list_j.size()); k++) {
                    if (list_i.get(k) != list_j.get(k)) {
                        int dist = list_i.size() - k + list_j.size() - k;
                        if (dist <= distance) res++;
                        break;
                    }
                }
            }
        }
        return res;
    }
	
	private static void findLeaves(TreeNode node, List<TreeNode> trail, List<TreeNode> leaves, Map<TreeNode, List<TreeNode>> map) {
        if (node == null) return;
        List<TreeNode> tmp = new ArrayList<>(trail);
        tmp.add(node);
        if (node.left == null && node.right == null) {
            map.put(node, tmp);
            leaves.add(node);
            return;
        }
        findLeaves(node.left, tmp, leaves, map);
        findLeaves(node.right, tmp, leaves, map);
    }
	
	  
	public static class TreeNode {
		int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.val = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	    	this.val = val;
	    	this.left = left;
	    	this.right = right;
	    	}
	}
	
	
	
	 
}
