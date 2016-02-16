package test.coursera.robertsedgewick.week2;

import coursera.robertsedgewick.week2.SelectionSort;
import coursera.robertsedgewick.week2.Sort;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Ganesh Satpute.
 * @date 9/27/2015 1:11 AM
 * @email ghsatpute@gmail.com
 */
public class TestSelectionSort {

    @Test
    public void testSelectionSort() {

        Sort sort = new SelectionSort();
        int[] array = {4, 5, 6, 3, 9, 5, 5, 7, 8, 2, 1};
        sort.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
