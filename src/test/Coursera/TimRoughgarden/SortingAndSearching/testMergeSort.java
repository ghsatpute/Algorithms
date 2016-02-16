package test.coursera.timroughgarden.sortingandsearching;


import coursera.timroughgarden.sortingandsearching.MergeSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/*
 *  @author : Ganesh Satpute
 *  @date   : 1/26/2015  2:40 PM
 *
 */
public class TestMergeSort {

        @Test
        public void testMergeSort()
        {
            // create a new array
            int[] array =  { 1,5,3,7,9,2,8,4,6, 45,23 , 45, 33};
            int[] output = MergeSort.mergeSort(array);

            Assert.assertEquals(Arrays.toString(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 23, 33, 45, 45}),
                                Arrays.toString( output));

        }
    }
