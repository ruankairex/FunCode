package starGraph;

import java.util.HashSet;

public class diamond {
	public static void main(String[]args) {
		makeDiamondGraph(6);
	}
	
	
	public static void makeDiamondGraph(int a) {
	     String space = " ";
	     String star = "*";
	     int weight = 2 * a - 1;
	     int rule = a - 1;
	     HashSet<Integer> intSet = new HashSet<>();
	     
	     // 預先計算需要的值
	     for (int i = 0; i < a; i++) {
	         intSet.add(rule + i * 2);
	     }

	     // 使用 StringBuilder 建立圖形
	     StringBuilder sb = new StringBuilder();
	     for (int i = 0; i <= weight; i++) {
	         for (int j = 0; j <= weight; j++) {
	             // 確定要輸出的字符
	             if (intSet.contains(i + j) && Math.abs(i - j) < a + 1) {
	                 sb.append(star);
	             } else {
	                 sb.append(space);
	             }
	         }
	         sb.append("\n");
	     }

	     // 打印圖形
	     System.out.print(sb.toString());
	 }
}
