package coursera.robertsedgewick.week1;

import java.util.Arrays;

/**
 * @author Ganesh Satpute.
 * @date 9/27/2015 1:11 AM
 * @email ghsatpute@gmail.com
 */
public class QuickUnion implements IUnionFind {

    protected int[] array;

    /**
     * Constructor for `QuickUnion`, creates array of give length.
     * Initialize each element to be it's own parent.
     * This way we have forest containing each element as a tree.
     *
     * @param n length of array
     */
    public QuickUnion(int n) {
        array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = i;
    }

    @Override
    public boolean connected(int index1, int index2) {
        int root1 = findRoot(index1);
        int root2 = findRoot(index2);
        return root1 == root2;
    }

    @Override
    public void union(int index1, int index2) {
        if (!connected(index1, index2)) {
            int root1 = findRoot(index1);
            int root2 = findRoot(index2);

            //System.out.println("Root of index  " + index1 + " is " + root1
            //       + "\nRoot of index " + index1 + " is " + root2);

            array[root2] = root1;
        }
    }

    protected int findRoot(int index) {
        int root = index;
        while (array[root] != root)
            root = array[root];
        return root;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
