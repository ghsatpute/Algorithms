
package coursera.robertsedgewick.week1;


/**
 * @author Ganesh Satpute.
 * @date 9/27/2015 1:11 AM
 * @email ghsatpute@gmail.com
 */


import java.util.Arrays;

/**
 * If two value at particular indexes match that means they are connected components.
 * <p/>
 * | 0 | 1 | 1 | 3 | 3 | 2 | 3 |   <- the value
 * 0   1   2   3   4   5   6     <- Index
 * <p/>
 * Here element number {0}, {1,2}, {3,4,6}, {5} are connected components
 */

public class QuickFindEagerApproach implements IUnionFind {

    private int[] array;

    /**
     * This constructor takes input N. And creates array of that length.
     * In eager approach we need initialize the array element with it's index itself
     */
    public QuickFindEagerApproach(int N) {
        array = new int[N];
        for (int i = 0; i < N; i++)
            array[i] = i;
    }

    /**
     * @param index1 : First index which is to be checked connecteness
     * @param index2 : Second index which is to be checked connecteness
     * @return returns true if they are connected otherwise false
     */
    public boolean connected(int index1, int index2) {
        if (index1 >= array.length || index2 >= array.length)
            throw new IllegalArgumentException("Indexes given should be less than the length of array");
        return array[index1] == array[index2];
    }

    /**
     * @param index1, index2 : Indexes of elements which are to connected
     */
    public void union(int index1, int index2) {
        if (index1 >= array.length || index2 >= array.length)
            throw new IllegalArgumentException("Indexes given should be less than the length of array");

        int id1 = array[index1];
        int id2 = array[index2];

        // Check if they are already connected, if yes then nothing needs to be done
        if (!connected(index1, index2)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == id1)
                    array[i] = id2;
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
