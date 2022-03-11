/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n, h, x, flag = 0;
        n = sc.nextInt();
        h = sc.nextInt();
        x = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] + x >= h) {
                flag = 1;
            }
        }
        System.out.println(flag == 1 ? "YES" : "NO");
    }
}
