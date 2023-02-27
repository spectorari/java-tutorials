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
		super(w, h, "triangle");
		style = s;
	}
	
	// One-Argument Constructor
	Triangle(double x) {
		super(x, "triangle"); // call superclass constructor
		style = "filled";
	}
	
	// Construct an object from an object.
	Triangle(Triangle ob) {
		super(ob); // pass object to TwoDShape constructor
		style = ob.style;
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
