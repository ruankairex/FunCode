package fenwicktree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountTeamsNum {

	public static void main(String[] args) {
		int[] sols = {2,5,3,4,1};
	
		try {
			int a = numTeams(sols);
			System.out.println(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static int numTeams(int[] rating) {
        int n = rating.length;
        if (n < 3) return 0;
        
        // Create a list of soldiers with their ratings and indices
        List<Soldier> soldiers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            soldiers.add(new Soldier(rating[i], i));
        }
        
        // Sort soldiers by rating
        Collections.sort(soldiers);
        
        int[] indexMap = new int[n];
        for (int i = 0; i < n; i++) {
            indexMap[soldiers.get(i).index] = i;
        }
        
        int teams = 0;
        
        // Count ascending teams
        teams += countTeams(indexMap, n, true);
        
        // Count descending teams
        teams += countTeams(indexMap, n, false);
        
        return teams;
    }
	
	
	private static int countTeams(int[] indexMap, int n, boolean ascending) {
        int[] bit = new int[n + 1];
        int teams = 0;
        
        for (int i = 0; i < n; i++) {
            int rank = indexMap[i] + 1;
            int left = ascending ? getSum(bit, rank - 1) : getSum(bit, n) - getSum(bit, rank);
            int right = ascending ? n - rank - (getSum(bit, n) - getSum(bit, rank)) : rank - 1 - getSum(bit, rank - 1);
            teams += left * right;
            update(bit, rank, 1);
        }
        
        return teams;
    }
    
    private static void update(int[] bit, int index, int val) {
        while (index < bit.length) {
            bit[index] += val;
            index += index & (-index);
        }
    }
    
    private static int getSum(int[] bit, int index) {
        int sum = 0;
        while (index > 0) {
            sum += bit[index];
            index -= index & (-index);
        }
        return sum;
    }
    
    private static class Soldier implements Comparable<Soldier> {
        int rating;
        int index;
        
        Soldier(int rating, int index) {
            this.rating = rating;
            this.index = index;
        }
        
        @Override
        public int compareTo(Soldier other) {
            return Integer.compare(this.rating, other.rating);
        }
    }
	
}


