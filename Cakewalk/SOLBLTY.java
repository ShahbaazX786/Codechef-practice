/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t, x, a, b;
        t = s.nextInt();
        while (t != 0) {
            x = s.nextInt();
            a = s.nextInt();
            b = s.nextInt();
            x = a + (100 - x) * b;
            System.out.println(x * 10);
            t -= 1;
        }
    }
}
