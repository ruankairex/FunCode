package nums;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Objects;

public class GenerateDifferentNums {
	public static void main(String[] args) {
        Integer[] integers = new Integer[8];
        // 初始化陣列
        Arrays.fill(integers, 0);

        
        Integer tmp = 0;
        Double avg = 0.0D;
        Double sum = 0.0D;
        int index = 0;

        // 指標法
        while (index < integers.length) {
        	boolean shouldBreak = false;
            tmp = Integer.valueOf((int)(Math.random()*10)+1);
            for (int i=0; i<=index; i++){
                if (Objects.equals(integers[i], tmp)){
                	shouldBreak = true;
                    break;
                }
            }
            if (shouldBreak) {
            	continue;
            }
            integers[index] = tmp;
            sum += tmp;
            index++;
        }
        for(int i : integers) {
        	System.out.println(i);
        }
    }
}
