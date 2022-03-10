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
            int a[] = new int[3];
            int b[] = new int[3];
            int t1 = 0, t2 = 0;
            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                b[i] = sc.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                if (a[i] > b[i]) {
                    t1 += 1;
                } else {
                    t2 += 1;
                }
            }
            // System.out.println(t1+" "+t2);
            System.out.println(t1 > t2 ? "A" : "B");
        }
    }
}