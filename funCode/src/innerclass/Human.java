package innerclass;

public class Human {

	private String name;
	private Wearing wear;
	
	public Human(String str) {
		this.name=str;
		wear = new Wearing();
	}
	
	public void setWear(String c, String s) {
		this.wear.color = c;
		this.wear.size = s;
	}
	
	public String getWear() {
		return this.name+"穿的顏色是:"+this.wear.color+"，尺寸是:"+this.wear.size;
	}
	
	private class Wearing{
		String color;
		String size;
	}
}
