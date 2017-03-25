import java.util.Arrays;

/** 
 * BubbleSorter class implements the Sorter interface.
 * @author ponbarry
 */
public class BubbleSorter implements Sorter {

	/** 
	 * Constructor
	 */
	public BubbleSorter() {
		// nothing needs to be done
	}
	
	/**
	 * Uses the bubble sort algorithm to modify the passed-in array
	 * so that its elements are in ascending, sorted order.
	 * Prints out the current state of array each time any two 
	 * elements swap places. 
	 * Assumes that the passed-in array is an array of int elements.
	 */
	public void sortArrayInPlace(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (compare(array[j+1], array[j]) == 1) {
				    swap(array, j, j+1);
				}
                System.out.println(Arrays.toString(array));
			}

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
