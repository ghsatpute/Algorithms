package coursera.robertsedgewick.week2;

/**
 * @author Ganesh Satpute.
 * @date 9/27/2015 1:03 AM
 * @email ghsatpute@gmail.com
 */
public abstract class Sort {

    public abstract void sort(int[] array);

    protected void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
