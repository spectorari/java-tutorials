package inheritance;

public class ColorTriangle extends Triangle {
	private String color;

	ColorTriangle(String c, String s, double w, double h) {
		super(s, w, h);
		color = c;
	}
	
	ColorTriangle(ColorTriangle ob) {
		super(ob);
		color = ob.color;
	}
	
	String getColor() { return color; }
	
	void showColor() {
		System.out.println("Color is " + color);
	}
}
