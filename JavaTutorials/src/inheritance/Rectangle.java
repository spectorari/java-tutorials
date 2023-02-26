package inheritance;

public class Rectangle extends TwoDShape {
	
	// Default Constructor
	Rectangle() {
		super();
	}
	
	// Constructor
	Rectangle(double w, double h) {
		super(w, h);
	}
	
	// One-Argument Constructor
	Rectangle(double x) {
		super(x);
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
