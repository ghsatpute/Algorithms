package coursera.timroughgarden.sortingandsearching;


import java.util.Arrays;

/*
 *  @author : Ganesh Satpute
 *  @date   : 1/26/2015  1:47 PM
 *
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array =  { 1,5,3,7,9,2,8,4,6, 45,23 , 45, 33};

        int[] output = MergeSort.mergeSort(array);
        System.out.println("Sorted array : " + Arrays.toString(output));

    }

    public static int[] mergeSort(int[] array) {
        // Base case, If array is of length 1 then return
        if(array.length == 1)
            return array;
        else {
            int mid = array.length/2;
            int[] leftArray = Arrays.copyOfRange(array, 0, mid);
            int[] rightArray = Arrays.copyOfRange(array, mid, array.length);
            //System.out.println("Left array is : " + Arrays.toString(leftArray)  + "\n Right array is : " + Arrays.toString(rightArray));
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(array, leftArray,rightArray);
            return array;
        }
    }
    private static void merge(int array[], int[] leftArray, int[] rightArray) {
        int leftCounter = 0;
        int rightCounter = 0;
        int counter = 0;

        while(counter < array.length) {
            // Find out minimum element from leftArray and rightArray
            if(leftArray[leftCounter] <= rightArray[rightCounter]) {
                array[counter] = leftArray[leftCounter];
                leftCounter++;
                counter++;
                if(leftCounter >= leftArray.length)
                    break;
            }
            else {
                array[counter] = rightArray[rightCounter];
                rightCounter++;
                counter++;
                if(rightCounter >= rightArray.length)
                    break;
            }
        }
        // If all left elements are exhausted
        if(leftCounter >= leftArray.length) {
            // copy all right elements
            while(rightCounter < rightArray.length && counter < array.length) {
                array[counter] = rightArray[rightCounter];
                rightCounter++;
                counter++;
            }
        }
        // If all right elements are exhausted
        if(rightCounter >= rightArray.length) {
            // copy all right elements
            while(leftCounter < leftArray.length) {
                array[counter]  = leftArray[leftCounter];
                leftCounter++;
                counter++;
            }
        }
    }
}
