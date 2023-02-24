package nested_class;
// Nested Class example from Java: A Beginner's Edition, Herbert Schildt (Chapter 6, pp. 217)

/*    DESCRIPTION
 The inner class, Inner, computes various values from 
 the array nums, which is a member of Outer.
  
 However acceptable for the Inner class to access the nums array directly, 
 the opposite is not true of the Outer class.
 
 It would not be possible for the methods of the inner class to be invoked 
 directly by the analyze method, without the creation of the inner object.
*/

public class Outer {
	int nums[];
	
	Outer(int n[]) {
		nums = n;
	}
	
	void analyze() {
		Inner inOb = new Inner();
		
		System.out.println("Minimum: " + inOb.min());
		System.out.println("Maximum: " + inOb.max());
		System.out.println("Average: " + inOb.avg());
	}
	
	// This is an inner class.
	class Inner {
		// Method that calculates the minimum
		int min() {
			int minimum = nums[0];
			
			for( int i=1; i < nums.length; i++)
				if(nums[i] < minimum) minimum = nums[i];
			
			return minimum;
		}
		// Method that calculates the maximum
		int max() {
			int maximum = nums[0];
			for( int i=1; i < nums.length; i++)
				if(nums[i] > maximum) maximum = nums[i];
			
			return maximum;
		}
		// Method that calculates the average
		int avg() {
			int sum = 0;
			for(int i=0; i < nums.length; i++)
				sum += nums[i];
			
			return sum / nums.length;
		}
	}
}
