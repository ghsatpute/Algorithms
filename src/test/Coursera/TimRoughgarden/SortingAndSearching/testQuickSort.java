package test.coursera.timroughgarden.sortingandsearching;


import coursera.timroughgarden.sortingandsearching.QuickSort;
import org.junit.Assert;
import org.junit.Test;

/*
 *  @author : Ganesh Satpute
 *  @date   : 1/27/2015  11:33 PM
 *
 */
public class TestQuickSort {
    @Test
    public void testPartition() {
        int[] array = { 5, 3, 8, 6, 2, 1, 9, 4, 7};
        Assert.assertEquals( 4, QuickSort.partition(array, 0, 8));
    }
}
