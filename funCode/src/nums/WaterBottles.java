package nums;

public class WaterBottles {
	public static void main(String[] args) {
		System.out.println(numWaterBottles(15,4));
	}
	
	
	public static int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;
        int tmp = 0;
        while(empty>=numExchange) {
        	tmp = empty/numExchange;
        	total += tmp;
        	empty = tmp+ empty%numExchange;
        }
        return total;
    }
}
