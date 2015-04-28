package Coursera.TimRoughgarden.Assignments;


import Coursera.TimRoughgarden.SortingAndSearching.CountingInversion;

/*
 *  @author : Ganesh Satpute
 *  @date   : 2/1/2015  4:17 PM
 *
 */
public class Assignment1 {

    public static void main(String[] args) {
        int[] array = IO.readSpaceSeparatedValues("temp");
        System.out.println("Size of array is " + array.length);
        long inversions = CountingInversion.sortCount(array);
        System.out.println("Number of inversions are : " + inversions);
    }
}
