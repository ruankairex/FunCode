package stack;

import java.util.Stack;

public class CrawlerLogFolder {

	public static void main(String[] args) {
		String[] logs = {"d1/", "d2/", "../", "d21/", "./"};
		System.out.println(minOperationsJustNum(logs));
	}
	
	public static int minOperationsJustNum(String[] logs) {
		int ans = 0;
		for(String log:logs) {
			if(log.equals("../")) {
				if(ans>0) {
					ans--;
				}
			}else if(!log.equals("./")) {
				ans++;
			}
		}
		return ans;
	}
	
	public static int minOperations(String[] logs) {
		Stack<String> stac = new Stack<>();
		for(String log:logs) {
			if(log.equals("../")) {
				if(!stac.empty()) {
					stac.pop();
				}
			}else if(!log.equals("./")) {
				stac.push(log);
			}
		}
		return stac.size();
    }
}
