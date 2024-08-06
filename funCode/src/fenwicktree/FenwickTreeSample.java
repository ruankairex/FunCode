package fenwicktree;

public class FenwickTreeSample {

	public static void main(String[] args) {
		int[] sols = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int[] ans = getFenwickTree(sols);
		for(int a : ans) {
			System.out.println(a);
		}
		
	}
	private static int[] getFenwickTree(int[] data) {
		int[] fenwickTree = new int[data.length+1];
		
		for(int i=1; i<fenwickTree.length; i++) {
			updateFenwickTree(fenwickTree, i, data[i-1]);
		}
		
		return fenwickTree;
	}
	
	private static void updateFenwickTree(int[] fenwickTree, int index, int value) {
		while(index < fenwickTree.length) {
			fenwickTree[index] += value;
			index += index & (-index);
		}
	}
	
	private static int queryFenwickTree(int[] fenwickTree, int index) {
		int sum = 0; 
		while(index > 0) {
			sum += fenwickTree[index];
			index -= index & (-index);
		}
		return sum;
	}
}
