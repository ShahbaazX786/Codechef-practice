/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t;
        double a[] = new double[5];
        t = sc.nextInt();
        while (t > 0) {
            for (int i = 0; i < 5; i++) {
                a[i] = sc.nextDouble();
            }
            a[0] /= a[2];
            // System.out.println(a[0]);
            a[1] /= a[3];
            // System.out.println(a[1]);
            a[0] = (a[0] < a[1] ? a[0] : a[1]);
            // System.out.println(a[0]);
            System.out.println(a[0] >= a[4] ? "YES" : "NO");
            t -= 1;
        }
    }
}
