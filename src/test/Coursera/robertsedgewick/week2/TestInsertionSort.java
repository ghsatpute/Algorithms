package test.coursera.robertsedgewick.week2;

import coursera.robertsedgewick.week2.InsertionSort;
import coursera.robertsedgewick.week2.Sort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Ganesh on 9/27/2015.
 */
public class TestInsertionSort {

    @Test
    public void testInsertionSort() {
        Sort sort = new InsertionSort();
        int[] array = {4, 5, 6, 3, 9, 5, 5, 7, 8, 2, 1};
        sort.sort(array);

        System.out.println(Arrays.toString(array));
    }

    @Test
    public void test() {
        String test = "";
        int i = test.length();
        int j = 9;
    }
}
