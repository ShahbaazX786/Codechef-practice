/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t, c1, c2, r1, r2;
        t = s.nextInt();
        while (t > 0) {
            c1 = c2 = r1 = r2 = 0;
            c1 = s.nextInt();
            c2 = s.nextInt();
            r1 = s.nextInt();
            r2 = s.nextInt();
            c1 = r1 / c1;
            c2 = r2 / c2;
            System.out.println(c1 + c2);
            t -= 1;
        }
    }
}
