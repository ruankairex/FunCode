package nums;

import java.util.ArrayList;
import java.util.List;

public class FindWinnerOfCircular {
	public static void main(String[] args) {
		System.out.println(findTheWinnerBetter(6,5)+1);
	}
	
	//遞迴
	public static int findTheWinnerBetter(int n, int k) {
		if(n==1)return 0;
		return(findTheWinnerBetter(n-1,k)+k)%n;
		
	}
	
	//普通作法
	public static int findTheWinner(int n, int k) {
        ArrayList<Integer> circle = new ArrayList<>();
        for(int i=1; i<=n; i++) {
        	circle.add(i);
        }
        int current = 0;
        while(circle.size()>1) {
        	int remove_index = (current+k-1)%circle.size();
        	circle.remove(remove_index);
        	current = remove_index;
        }
        return circle.get(0);
    }
}
