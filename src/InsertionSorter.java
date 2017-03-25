import java.util.Arrays;

/**
 * InsertionSorter class implements the Sorter interface.
 *
 * @author ponbarry
 */
public class InsertionSorter implements Sorter {

    /**
     * Constructor
     */
    public InsertionSorter() {
        // nothing needs to be done
    }

    /**
     * Uses the insertion sort algorithm to modify the passed-in array
     * so that its elements are in ascending, sorted order.
     * Prints out the current state of array for each iteration (each
     * time the index marking the "sorted" section of the array is updated).
     * Assumes that the passed-in array is an array of int elements.
     */
    public void sortArrayInPlace(int[] array) {
        for (int i = 0; i <= array.length - 2; i++) {
            if (compare(array[i], array[i + 1]) == -1) {
                swap(array, i, i + 1);
                for (int j = i; j > 0; j--) {
                    if (compare(array[j - 1], array[j]) == -1) {
                        swap(array, j, j - 1);
                    } else {
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    private int compare(int x, int y) {
        if (x < y) {
            return 1;
        } else if (x > y) {
            return -1;
        }
        return 0;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
