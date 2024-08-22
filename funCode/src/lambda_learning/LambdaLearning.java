package lambda_learning;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaLearning {
	
	public static void main(String[] args) {
		practice03();
	}
	
	public static void practice01() {
		Comparator<String> byLength = new Comparator<>(){
			public int compare(String name1, String name2) {
				return name1.length() - name2.length();
			}
		};
		String[] names = {"ace","jack","queen","king"};
		Arrays.sort(names, byLength);
		for(String name : names) {
			System.out.println(name);
		}
	}
	
	public static void practice02() {
		Comparator<String> byLength = (String name1, String name2) -> name1.length() - name2.length();
		
		String[] names = {"ace","jack","queen","king"};
		Arrays.sort(names, byLength);
		for(String name : names) {
			System.out.println(name);
		}
	}
	
	public static void practice03() {
		Comparator<String> byLength = (name1,name2) -> name1.length() - name2.length();
		
		String[] names = {"ace","jack","queen","king"};
		Arrays.sort(names, byLength);
		for(String name : names) {
			System.out.println(name);
		}
	}
	
	public static void practice04() {
		String[] names = {"ace","jack","queen","king"};
		Arrays.sort(names, (name1,name2) -> name1.length() - name2.length());
		for(String name : names) {
			System.out.println(name);
		}
	}

}
