package interfaces;

public interface Series {
	int getNext();  // return next number in series
	
	// Return an array that contains the next n elements
	// in the series beyond the current element.
	default int[] getNextArray(int n) {
		int[] vals = new int[n];
		
		for(int i=0; i < n; i++) vals[i] = getNext();
		return vals;
	}
	void reset();   // restart
	void setStart(int x);  // set starting value
	
}
