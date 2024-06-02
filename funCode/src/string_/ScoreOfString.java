package string_;

public class ScoreOfString {
	public static void main(String[]arg) {
		String data = "zaz";
		scoreOfString(data);
	}
	
	public static int scoreOfString(String s) {
		int score = 0;
        for(int i=0; i<s.length()-1; i++) {
        	score += Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        System.out.println(score);
        return score;
    }
}
