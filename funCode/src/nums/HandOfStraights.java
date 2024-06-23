package nums;

import java.util.Map;
import java.util.TreeMap;

public class HandOfStraights {
	
	public static void main(String[]args) {
		int[] data = {1,2,3,6,2,3,4,7,8};
		boolean a = isNStraightHand(data,3);
		System.out.println(a);
	}
	
	public static boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize != 0) {
        	return false;
        }
        
        Map<Integer,Integer> numMap = new TreeMap<>();
        
        for(int card:hand) {
        	numMap.put(card, numMap.getOrDefault(card,0)+1);
        }
        
        for(int card:numMap.keySet()) {
        	int count = numMap.get(card);
        	if(count>0) {
        		for(int i=1; i<groupSize; i++) {
        			if(!numMap.containsKey(card + i) || numMap.get(card+i)<count) {
        				return false;
        			}
        			numMap.put(card+i, numMap.get(card+i)-count);
        		}
        		
        	}
        }
        return true;
    }
}
