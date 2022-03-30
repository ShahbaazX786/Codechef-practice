/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int t, n, m;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        while (t > 0) {
            n = s.nextInt();
            m = s.nextInt();
            System.out.println(n * m);
            t -= 1;
        }
    }
}
