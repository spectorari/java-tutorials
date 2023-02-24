package varargs;

// VarArgs (...) example from Java: A Beginner's Edition, Herbert Schildt (Chapter 6, pp. 222)
// Demonstrate variable - length arguments.
public class VarArgs {

	// vaTest() uses a vararg.
	static void vaTest(int ... v) {
		System.out.println("Number of args: " + v.length);
		System.out.println("Contents: " );
		
		for(int i=0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);
		
		System.out.println();
			 
	}
	
	public static void main(String[] args) {
		// Notice how vaTest() can be called 
		// with a variable number of arguments.
		
		vaTest(10);			// 1 arg
		vaTest(1, 2, 3);	// 3 args
		vaTest();			// No args

	}

}
