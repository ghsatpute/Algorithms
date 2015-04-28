/*
 *  @author : Ganesh Satpute
 *  @date   : 2/22/2015  1:54 PM
 *
 */
public class scratchPad {
    public static void main(String[] args) {
        char c = 'a';
        long l = c;
        byte b = 1;
        short s = b;
        s = (short) c;

        int i = 0;

        if (i < 2)

        {
            label :

            System.out.print("i is " + i);

                    i++;

            continue label;

        }
    }
}
