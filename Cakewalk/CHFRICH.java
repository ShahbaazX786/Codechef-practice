/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t, a, b, x;
        t = s.nextInt();
        while (t > 0) {
            a = s.nextInt();
            b = s.nextInt();
            x = s.nextInt();
            b -= a;
            b /= x;
            System.out.println(b);
            t -= 1;
        }
    }
}
