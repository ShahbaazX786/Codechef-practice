/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t, p, m, v;
        t = s.nextInt();
        while (t > 0) {
            p = m = v = 0;
            p = s.nextInt();
            m = s.nextInt();
            v = s.nextInt();
            p -= 1;
            m -= p;
            v *= m;
            System.out.println(v);
            t -= 1;
        }
    }
}
