package string_;

//規則:input一段字串，包含英文大小寫、逗號、空格
//問題:請改成:逗號、空格之後的英文為大寫，其他小寫
//e.g. input:aBc,eDD fol   output:Abc,Edd Fol
public class StringInit {
	public static void main(String[] arg) {
		String question = "aBc,eDD fol";
		changeString(question);
	}
	
	public static void changeString(String input) {
		char[] lis = input.toCharArray();
		for(int i=0; i<lis.length; i++) {
			if(lis[i] == ',' || lis[i] == ' ') {
				//如果是小寫，換大寫
				if(i+1<lis.length-1 &&(lis[i+1]>=97 && lis[i+1]<=122)) {
					lis[i+1] = (char)(lis[i+1]-32);
				}
				//跳過下一字
				i++;
			}else {
				if(lis[i]>=65 && lis[i]<=90) {
					lis[i] = (char)(lis[i]+32);
				}
			}
		}
		System.out.println(lis);
	}
	
}
