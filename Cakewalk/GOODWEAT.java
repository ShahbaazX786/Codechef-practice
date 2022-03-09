/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, a[] = new int[7];
        t = sc.nextInt();
        while (t-- > 0) {
            int c1 = 0, c2 = 0;
            for (int i = 0; i < 7; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) {
                    c1 += 1;
                } else if (a[i] == 0) {
                    c2 += 1;
                }
            }
            System.out.println(c2 > c1 ? "NO" : "YES");
        }
    }
}
