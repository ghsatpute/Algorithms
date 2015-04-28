package Coursera.TimRoughgarden.Assignments;


import Coursera.TimRoughgarden.SortingAndSearching.QuickSort;

import java.util.Arrays;

/*
 *  @author : Ganesh Satpute
 *  @date   : 2/3/2015  9:45 PM
 *
 */
public class ProgrammingQuestion2 {

    public static void main(String[] args) {
        int[] array = IO.readSpaceSeparatedValues("data\\QuickSort.txt");
        //int[] array = { 2, 1,3,4};
        System.out.println("Number of inputs : " + array.length);
        long inversions = QuickSort.quickSort( array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
        System.out.println("Comparisons are : " + inversions);
    }
}
