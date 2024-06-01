package starGraph;

public class Triango {
	public static void main(String[]args) {
		makeTriango2(6);
	}
	
	//半個三角形
	public static void makeTriango(int n) {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//半個三角形+下半部
		public static void makeTriango2(int n) {
			for(int i=0; i<=n; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=1; i<=n; i++) {
				for(int j=n-i; j>=0; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
