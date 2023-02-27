package inheritance;

public class Shapes {

	public static void main(String[] args) {
		// Initialize Objects
		ColorTriangle t1 = new ColorTriangle("Blue", "filled", 4.0, 4.0);
		ColorTriangle t2 = new ColorTriangle(t1);
		Rectangle r1 = new Rectangle(8.0);

		// t1
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		t1.showColor();
		System.out.println("Area is " + t1.area());

		System.out.println();

		// t2
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		t2.showColor();
		System.out.println("Area is " + t2.area());

		System.out.println();

		// r1
		System.out.println("Info for r1: ");
		System.out.println("Is r1 a square? " + r1.isSquare());
		System.out.println("Area is " + r1.area());
	}

}
