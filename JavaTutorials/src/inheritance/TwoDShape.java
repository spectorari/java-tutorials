package inheritance;
// Hierarchy example from Java: A Beginner's Edition, Herbert Schildt (Chapter 7, pp. 230-232)

// A simple class hierarchy
public class TwoDShape {
	private double width;
	private double height;
	
	// Default Constructor
	TwoDShape() {
		width = height = 0.0;
	}
	// Parameterized constructor
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}
	
	// Construct object with equal width and height
	TwoDShape(double x) {
		width = height = x;
	}
	
	// Accessor methods for width and height
	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) { width = w; }
	void setHeight(double h) { height = h; }
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}
