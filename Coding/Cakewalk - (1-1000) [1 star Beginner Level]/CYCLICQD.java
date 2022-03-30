/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t, a, b, c, d;
        t = s.nextInt();
        while (t > 0) {
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            d = s.nextInt();
            a = a + c;
            b = b + d;
            if (a == 180 && b == 180) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t -= 1;
        }
    }
}