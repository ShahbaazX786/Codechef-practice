/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t, i, p, f;
        t = s.nextInt();
        while (t != 0) {
            i = f = p = 0;
            i = s.nextInt();
            p = s.nextInt();
            f = s.nextInt();
            p = i * p;
            f = i * f;
            f -= p;
            System.out.println(f);
            t -= 1;
        }
    }
}
