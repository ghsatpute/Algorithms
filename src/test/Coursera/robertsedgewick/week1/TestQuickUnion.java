package test.coursera.robertsedgewick.week1;

import coursera.robertsedgewick.week1.QuickUnion;
import org.junit.Test;

/**
 * @author Ganesh Satpute.
 * @date 9/12/2015 1:07 AM
 * @email ghsatpute@gmail.com
 */
public class TestQuickUnion {
    @Test
    public void testUnion() {
        QuickUnion quickUnion = new QuickUnion(8);
        quickUnion.union(1, 4);
        System.out.println(quickUnion.toString());
        quickUnion.union(4, 6);
        System.out.println(quickUnion.toString());
        System.out.println(quickUnion.connected(4, 6));
    }
}
