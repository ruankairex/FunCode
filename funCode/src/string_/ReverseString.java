package string_;

public class ReverseString {
	
	public static void main(String[]arg) {
		char[] data = {'h','e','l','l','o'};
		reverseString(data);
	}
	
	public static void reverseString(char[] s) {
        for(int i=0; i<(s.length/2); i++) {
        	char tmp = s[i];
        	s[i] = s[s.length-1-i];
        	s[s.length-1-i] = tmp;
        }
        System.out.println(s);
    }

}
