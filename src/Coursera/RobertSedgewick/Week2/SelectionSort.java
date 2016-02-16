package coursera.robertsedgewick.week2;

/**
 * @author Ganesh Satpute.
 * @date 9/27/2015 1:09 AM
 * @email ghsatpute@gmail.com
 */
public class SelectionSort extends Sort {


    @Override
    public void sort(int[] array) {
        if (array == null || array.length == 1)
            return;

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            // For right part of array, find minimum element.
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) minIndex = j;
            }

            swap(array, i, minIndex);
        }
    }
}
