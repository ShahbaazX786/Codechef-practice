/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, a, b;
        int ar[] = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int t1 = 0, t2 = 0;
            a = sc.nextInt();
            b = sc.nextInt();
            a += b;
            while (a > 0) {
                t2 = a % 10;
                a /= 10;
                t1 += ar[t2];
            }
            System.out.println(t1);
        }
    }
}