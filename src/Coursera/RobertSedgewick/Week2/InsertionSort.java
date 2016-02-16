package coursera.robertsedgewick.week2;

/**
 * @author Ganesh Satpute.
 * @date 9/27/2015 1:11 AM
 * @email ghsatpute@gmail.com
 */

public class InsertionSort extends Sort {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length == 1)
            return;

        for (int i = 0; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] <= array[j - 1]) {
                swap(array, j, j - 1);
                j--;
            }
        }
    }
}
