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
        t = sc.nextInt();
        while (t-- > 0) {
            int a[] = new int[5];
            for (int i = 0; i < 5; i++) {
                a[i] = sc.nextInt();
            }
            a[0] *= a[1];
            if (a[0] < 10) {
                System.out.println(0);
            } else if (a[0] >= 10 && a[0] < 21) {
                System.out.println(a[2]);
            } else if (a[0] >= 21 && a[0] < 42) {
                System.out.println(a[3]);
            } else if (a[0] >= 42) {
                System.out.println(a[4]);
            }
        }
    }
}