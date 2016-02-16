package test.coursera.robertsedgewick.week1;

import coursera.robertsedgewick.week1.QuickFindEagerApproach;
import coursera.robertsedgewick.week1.WeightedQuickUnion;
import org.junit.Test;

/**
 * @author Ganesh Satpute.
 * @date 9/13/2015 1:07 AM
 * @email ghsatpute@gmail.com
 */
public class TestQuiz1 {

    @Test
    public void testQuiz1Question1() {
        QuickFindEagerApproach qf = new QuickFindEagerApproach(10);
        qf.union(0, 7);
        qf.union(4, 3);
        qf.union(2, 5);
        qf.union(3, 9);
        qf.union(7, 2);
        qf.union(6, 5);
        System.out.println(qf.toString());
    }

    @Test
    public void testQuiz1Question2() {
        //  union 4-8 0-5 7-8 3-6 4-1 1-9 5-6 5-4 8-2
        WeightedQuickUnion quickUnion = new WeightedQuickUnion(10);
        quickUnion.union(4, 8);
        quickUnion.union(0, 5);
        quickUnion.union(7, 8);
        quickUnion.union(3, 6);
        quickUnion.union(4, 1);
        quickUnion.union(1, 9);
        quickUnion.union(5, 6);
        quickUnion.union(5, 4);
        quickUnion.union(8, 2);
        System.out.println(quickUnion.toString());
    }
}
