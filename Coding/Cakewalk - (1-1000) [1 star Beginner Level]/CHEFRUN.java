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
            double c = 0, k = 0;
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int x3 = sc.nextInt();
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            c = Math.abs((double) (x1 - x3) / v1);
            k = Math.abs((double) (x2 - x3) / v2);
            // System.out.println(c+" "+k);
            if (c == k) {
                System.out.println("Draw");
            } else {
                System.out.println(c < k ? "Chef" : "Kefa");
            }
        }
    }
}