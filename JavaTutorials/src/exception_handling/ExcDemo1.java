package exception_handling;
// Demonstrate exception handling
public class ExcDemo1 {

	public static void main(String[] args) {
		int nums[] = new int[4];
		
		try {
			System.out.println("Before exceptions generated.");
			
			// Generate an index out-of-bounds exception.
			nums[7] = 10;
			System.out.println("No catch");
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			// catch the exception
			System.out.println("Index out-of-bounds!");
		}
		System.out.println("After catch statement");
	}

}
