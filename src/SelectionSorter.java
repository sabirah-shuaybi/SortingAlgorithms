import java.util.Arrays;

/** 
 * SelectionSorter class implements the Sorter interface.
 * @author ponbarry
 */
public class SelectionSorter implements Sorter {

	/** 
	 * Constructor
	 */
	public SelectionSorter() { 
		// nothing needs to be done
	}
	
	/**
	 * Uses the selection sort algorithm to modify the passed-in
	 * array so that its elements are in ascending, sorted order.
	 * Prints out the current state of array for each iteration (each 
	 * time the index marking the "sorted" section of the array is updated).
	 * Assumes that the passed-in array is an array of int elements.
	 */
	public void sortArrayInPlace(int[] array) {
		for(int i=0; i<array.length-1; i++) {
			//minValue will initially equal the first element
			int minValue = i;
			for(int j=i+1; j<array.length; j++) {
				if(compare(array[j], array[minValue]) == 1) {
					minValue = j;
				}
			}
			//Only swap if they are different/separate elements
			if(minValue != i) {
				swap(array, i, minValue);
			}
			//Print current state of array
			System.out.println(Arrays.toString(array));
		}
	}

    private int compare(int x, int y) {
        if(x==y) {
            return 0;
        }
        if(x<y) {
            return 1;
        }
        else {
            return -1;
        }
    }

	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}



}
