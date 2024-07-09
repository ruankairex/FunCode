package nums;

public class AvgWaittingTime {

	public static void main(String[] args) {
		int[][] input = {
			    {1, 2},
			    {2, 5},
			    {4, 3}
			};
		double ans =averageWaitingTime(input);
		System.out.println(ans);
		
	}
	
	public static double averageWaitingTime(int[][] customers) {
		double currTime = customers[0][0];  // 當前時間從第一位客人的到達時間開始
        double totalWaitTime = 0;  // 總等待時間
        
        for (int i = 0; i < customers.length; i++) {
            int arrivalTime = customers[i][0];  // 客人的到達時間
            int processingTime = customers[i][1];  // 處理該客人所需的時間
            
            System.out.println("第" + i + "位客人，到達時間:" + arrivalTime);
            System.out.println("第" + i + "位客人，耗時:" + processingTime);
            
            if (currTime < arrivalTime) {
                currTime = arrivalTime;  // 如果當前時間小於客人到達時間，則跳到客人的到達時間
            }
            
            double waitTime = currTime + processingTime - arrivalTime;  // 計算當前客人的等待時間
            totalWaitTime += waitTime;  // 累加總等待時間
            
            currTime += processingTime;  // 處理完該客人後更新當前時間
            
            System.out.println("目前時間:" + currTime);
            System.out.println("客人總花費時間:" + totalWaitTime);
        }
        
        return totalWaitTime / customers.length;  // 計算並返回平均等待時間
    }
}
