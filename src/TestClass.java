/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

class TestClass {
    public static void main(String[] args) throws Exception {

        long reverse = 0;
        int copy = x;
        if (x < 0) {
            copy = -1 * x;

        }
        while (copy > 0) {

            int r = copy % 10;

            reverse = (reverse * 10) + r;
            copy = copy / 10;

        }

        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }
        if (x < 0) {
            return (int) reverse * -1;
        }


        return (int) reverse;


    }
}
