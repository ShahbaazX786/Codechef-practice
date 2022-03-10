/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, n, r;
        t = sc.nextInt();
        while (t-- > 0) {
            int t1 = 0, t2 = 0, s1 = 0, s2 = 0;
            n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] >= t1) {
                    t1 = a[i];
                }
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                if (b[i] >= t2) {
                    t2 = b[i];
                }
            }
            for (int i = 0; i < n; i++) {
                s1 += a[i];
                s2 += b[i];
            }
            s1 -= t1;
            s2 -= t2;
            if (s1 < s2) {
                System.out.println("Alice");
            } else if (s2 < s1) {
                System.out.println("Bob");
            } else {
                System.out.println("Draw");
            }
        }
    }
}