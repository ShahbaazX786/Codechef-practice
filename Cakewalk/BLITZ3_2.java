/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t, n, a, b;
        t = s.nextInt();
        while (t > 0) {
            n = a = b = 0;
            n = s.nextInt();
            a = s.nextInt();
            b = s.nextInt();
            n = 2 * (180 + n);
            a = a + b;
            System.out.println(n - a);
            t -= 1;
        }
    }
}
