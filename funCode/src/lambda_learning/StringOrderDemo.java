package lambda_learning;

import java.util.Arrays;
import java.util.Comparator;

import util.StringOrderUtil;

public class StringOrderDemo {
	public static void main(String[] args) {
		String[] names = {"Bush","Justin","Ann"};
		
		Arrays.sort(names, StringOrderUtil::byLength);
		
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, String::compareTo);
		
		Arrays.sort(names, (s1, s2) -> s1.compareTo(s2));
		
		Arrays.sort(names, new Comparator<String>() {
		    @Override
		    public int compare(String s1, String s2) {
		        return s1.compareTo(s2);
		    }
		});
		
		Arrays.sort(names, (String name1,String name2)->{
							name1 = name1.trim();
							name2 = name2.trim();
							return name1.length()-name2.length();
							});
		
		
		boolean a = true;
		boolean b = false;
		
		// 用lambda實體化方法
		FunInterfaceForLam<Integer, Boolean> func = (x, y) -> {
		    if (x && y) {
		        return 1;
		    } else {
		        return 0;
		    }
		};
		int result = func.orFun(a, b);
		System.out.println("a&&b:"+result);
		
		// 用匿名函式實體化
		FunInterfaceForLam<Integer, Boolean> func2 = new FunInterfaceForLam<>() {
			@Override
			public Integer orFun(Boolean a,Boolean b) {
				if (a && b) {
			        return 1;
			    } else {
			        return 0;
			    }
			}
		};
		
		// 匿名實作
		int result2 = new FunInterfaceForLam<Integer, Boolean>(){
			@Override
			public Integer orFun(Boolean a,Boolean b) {
				if (a && b) {
			        return 1;
			    } else {
			        return 0;
			    }
			}
		}.orFun(a,b);
		
	}
}
