package nums;

import java.util.ArrayList;
import java.util.List;

//給兩個數字，先轉置後再加總
//e.g. a=123,b=200 轉置 _a=321, _b=2,sum=323
public class TwoNumsReverseAndSum {
	
	public static void main(String[] args) {
		int ans = ReverseAndSum(9652, 239000);
		System.out.println(ans);
	}
	
	public static int ReverseAndSum(int a, int b) {
		//先轉置並存入List
		List<Integer> a_lis = new ArrayList<>();
		List<Integer> b_lis = new ArrayList<>();
		int tmp;
		while(a>0) {
			a_lis.add(a%10);
			a = a/10;
		}
		while(b>0) {
			b_lis.add(b%10);
			b = b/10;
		}
		
		//轉成數字int
		int re_a = 0;
		int re_b = 0;
		for(int i=0; i< a_lis.size(); i++) {
			re_a = re_a*10 + a_lis.get(i);
		}
		for(int i=0; i< b_lis.size(); i++) {
			re_b = re_b*10 + b_lis.get(i);
		}
		
		System.out.println("轉換過的a: "+re_a);
		System.out.println("轉換過的b: "+re_b);
		//相加
		return re_a+re_b;
	}
}
