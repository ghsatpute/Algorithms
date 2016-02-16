package coursera.timroughgarden.sortingandsearching;


import java.util.Arrays;

/*
 *  @author : Ganesh Satpute
 *  @date   : 2/1/2015  3:50 PM
 *
 */
public class CountingInversion {

    public static void main(String[] args) {
        int[] array =  { 9, 8 , 7 , 6, 5, 4, 3, 2, 1};

        long output = sortCount(array);
        System.out.println("Inversions are : " + output) ;

    }

    public static long sortCount(int[] array) {

        if(array.length == 1)
            return 0;
        else {
            // Divide the array
            int mid = array.length/2;
            int[] leftArray = Arrays.copyOfRange(array, 0, mid);
            int[] rightArray = Arrays.copyOfRange(array, mid , array.length);

            long leftInversions = sortCount(leftArray);
            long rightInversions = sortCount(rightArray);
            long splitInversions = mergeCountSplitInversions(array, leftArray, rightArray);
            System.out.println("Left " + leftInversions + "\t Right : " + rightInversions + "\t Split " + splitInversions  );

            return leftInversions + rightInversions +  splitInversions;
        }
    }

    private static long mergeCountSplitInversions(int[] array, int[] leftArray, int[] rightArray) {
        int leftCounter = 0;
        int rightCounter = 0;
        int counter = 0;
        long splitInversions = 0;

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
                // Split inversion
                splitInversions += (leftArray.length - leftCounter);
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
                splitInversions += (leftArray.length - leftCounter);
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
        return splitInversions;
    }
}
