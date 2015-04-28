package Coursera.TimRoughgarden.SortingAndSearching;


import java.util.Arrays;

/*
 *  @author : Ganesh Satpute
 *  @date   : 1/27/2015  10:58 PM
 *
 */
public class QuickSort {
    public static void main(String[] args) {
        //int[] array = { 4, 3, 11, 19, 8, 6, 2, 2, 1, 13, 12,  9, 5, 7, 18, 16, 14, 15};
        int[] array = {4, 1, 3, 2};
        System.out.println("Test : " + Arrays.toString(Arrays.copyOfRange(array, 2, 3)));
        long res = quickSort(array, 0, array.length - 1);
        System.out.println(" Count is " + res);
        //System.out.println(partition(array, 0 , 8 ));
        System.out.println("Sorted array is " + Arrays.toString(array));
    }

    /**
     *  Partitions the given array around the passed pivot and returns the pivot element
     *
     * @param array         : Array to be partitioned
     * @param leftIndex     : Left index from which array is to be partitioned
     * @param rightIndex    : Right index upto which array is to be partitioned
     * @return              : New index of pivot element, essentially all the elements to the
     *                          right of this index are greater than pivot & all the element to
     *                          the left are strictly smaller than pivot element
     */
    public static int partition(int[] array, int leftIndex, int rightIndex) {

        if(leftIndex >= array.length || rightIndex >= array.length)
            return -1;

        int i;  // Boundary line between elements we've looked so far and elements we've not looked
        int j;  // This will point to the element, elements before this element are less than pivot
                // And all the elements after this (up to j'th index) element are greater than pivot
                // |p|   < p | >p   |   ?      |         <- array
                // l         i      j          r         <- index
                // p - pivot element
                // <p - all the elements less than pivot
                // >p - all the elements greater than pivot
                // ?  - elements not visited
                // l  - LeftIndex
                // r  - rightIndex
        int temp;
        int pivot = choosePivot(array, leftIndex, rightIndex);
        // swap the pivot to first element
        temp = array[pivot];
        array[pivot] = array[leftIndex];
        array[leftIndex] = temp;

        // Let's start the algorithm
        i = leftIndex;
        // Till the end of array
        for(j = leftIndex + 1; j <= rightIndex ; j++) {
            // If pivot element (which is at 0th position) is greater than element at j'th index
            if(array[j] < array[leftIndex]) {
                //System.out.print("J " + j + "  i  " + i + "\t");
                //System.out.println("Before " + Arrays.toString(array));
                i++;
                // Swap the elements
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;

                //System.out.println("After " + Arrays.toString(array));
            }
            else {
                // just increment j
                // Which will be done by for loop
            }
        }
        // Finally place pivot element in it's own position
        // Which will be i'th position
        temp = array[i];
        array[i] = array[leftIndex];
        array[leftIndex] = temp;

        return i;
    }

    public static long quickSort(int[] array, int leftIndex, int rightindex) {
        if(leftIndex >= rightindex)
            return 0;

        if(leftIndex == rightindex)
            return 0;
        //System.out.println("Array before : " + Arrays.toString(array));
        int separator = partition(array, leftIndex, rightindex);
        //System.out.println("Separator is  : " + separator);
        //System.out.println("Left : " + leftIndex  + " Right : " + rightindex);
        //System.out.println("Left : " + leftIndex + " right : " + rightindex  + " separator : " + (separator - 1));
        int count = 0;
        if(leftIndex < separator) {
            //System.out.println("Left " + leftIndex);
            //System.out.println("Left is " + Arrays.toString(Arrays.copyOfRange(array, leftIndex, separator)));
            count += (separator - leftIndex);
            count += quickSort(array, leftIndex, separator - 1);
        }
        if(rightindex > separator) {
            //System.out.println("Right " + rightindex);
            //System.out.println("Right is " + Arrays.toString(Arrays.copyOfRange(array, separator + 1, rightindex + 1)));
            count += (rightindex - separator);
            count += quickSort(array, separator + 1, rightindex);
        }
        //System.out.println("Right is " + Arrays.toString(array));
        return count;
    }

    private static int choosePivot(final int[] array, int leftIndex, int rightIndex) {

        int temp;

        int middle = leftIndex + (rightIndex - leftIndex)/2;
        //System.out.println("\tleftIndx : " + leftIndex + "\tRight " + rightIndex + "\tmiddle " + middle);
        if(array[leftIndex] < array[middle] && array[middle] < array[rightIndex]) {
            temp = middle;
        }
        else if(array[middle] < array[leftIndex]  && array[leftIndex] < array[rightIndex] ) {
            temp = leftIndex;
        }
        else
            temp = rightIndex;

        //System.out.println("\tleftIndx : " + array[leftIndex] + "\tRight " + array[rightIndex] + "\tmiddle " + array[middle]);
        //System.out.println("temp : " + temp);
        return temp;
    }
}
