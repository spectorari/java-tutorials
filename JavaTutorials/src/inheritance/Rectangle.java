package inheritance;

public class Rectangle extends TwoDShape {
	
	// Default Constructor
	Rectangle() {
		super();
	}
	
	// Constructor
	Rectangle(double w, double h) {
		super(w, h, "rectangle");
	}
	
	// One-Argument Constructor
	Rectangle(double x) {
		super(x, "rectangle");
	}
	
	//Construct an object from an object
	Rectangle(Rectangle ob) {
		super(ob);
	}
	
	// Object Methods
	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
	
	double area() {
		return getWidth() * getHeight();
	}
}
