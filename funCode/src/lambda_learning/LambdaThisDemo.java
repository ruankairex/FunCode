package lambda_learning;

public class LambdaThisDemo {
	
	public static void main(String[] args) {
		Hello a = new Hello();
		a.r1.run();
		a.r2.run();
		
		Hello2 a2 = new Hello2();
		a2.r1.run();
		a2.r2.run();
	}

}

// 匿名類的this只會引用到當前的實例物件
class Hello {
	Runnable r1 = new Runnable() {
		public void run() {
			System.out.println(this);
		}
	};
	Runnable r2 = new Runnable() {
		public void run() {
			System.out.println(this.toString());
		}
	};
	Runnable r3 = new Runnable() {
		public void run() {
			System.out.println("HI");
		}
	};
}

// Lambda使用this的話可以引用當前類
class Hello2 {
	Runnable r1 = () -> System.out.println(this);
	Runnable r2 = () -> System.out.println(this.toString());
	
	public String toString() {
		return "Hello world";
	}
}
