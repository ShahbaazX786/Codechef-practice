/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, t1, t2;
        int a[] = new int[6];
        t = sc.nextInt();
        while (t > 0) {
            for (int i = 0; i < 6; i++) {
                a[i] = sc.nextInt();
            }
            t1 = 0;
            t2 = 0;
            for (int i = 0; i < 3; i++) {
                t1 += a[i];
                t2 += a[i + 3];
            }
            // System.out.println(t1);
            // System.out.println(t2);
            t1 = (t1 > t2) ? 1 : 2;
            System.out.println(t1);
            t -= 1;
        }
    }
}
