package coursera.robertsedgewick.week1;

/**
 * @author Ganesh Satpute.
 * @date 9/27/2015 1:11 AM
 * @email ghsatpute@gmail.com
 */

public class WeightedQuickUnion extends QuickUnion {

    int[] size;

    public WeightedQuickUnion(int n) {
        super(n);
        size = new int[n];
        // Currently each member is itself and tree with height 1
        // So set the height of each member to 1
        for (int i = 0; i < n; i++)
            size[i] = 1;
    }

    @Override
    public void union(int index1, int index2) {
        if (!connected(index1, index2)) {
            int root1 = findRoot(index1);
            int root2 = findRoot(index2);

            //System.out.println("Root of index  " + index1 + " is " + root1
            //        + "\nRoot of index " + index1 + " is " + root2);

            if (size[root1] < size[root2]) {
                array[root1] = root2;
                size[root2] += size[root1];
            } else {
                array[root2] = root1;
                size[root1] += size[root2];
            }

        }
    }
}
