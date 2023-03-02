package exception_handling;

public class RethrowDemo {

	public static void main(String[] args) {
		try {
			Rethrow.genException();
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			// recatch exception
			System.out.println("Fatal error - program terminated");
		}

	}

}
