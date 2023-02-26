package inheritance;
//Hierarchy example from Java: A Beginner's Edition, Herbert Schildt (Chapter 7, pp. 230 - 232)

// A subclass of TwoDShape for triangles.
public class Triangle extends TwoDShape {
	private String style;
	
	// Default Constructor
	Triangle() {
		super();
		style = "none";
	}
	
	// Constructor
	Triangle(String s, double w, double h) {
		super(w, h);
		style = s;
	}
	
	// One-Argument Constructor
	Triangle(double x) {
		super(x); // call superclass constructor
		style = "filled";
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
