package coursera.robertsedgewick.week1;

/**
 * @author Ganesh Satpute.
 * @date 9/27/2015 1:11 AM
 * @email ghsatpute@gmail.com
 */
public interface IUnionFind {
    boolean connected(int index1, int index2);

    void union(int index1, int index2);
}
