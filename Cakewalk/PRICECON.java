/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, n, x;
        t = sc.nextInt();
        while (t > 0) {
            n = sc.nextInt();
            x = sc.nextInt();
            int temp = 0;
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] > x) {
                    temp = temp + (a[i] - x);
                    a[i] = x;
                }
            }
            System.out.println(temp);
            t -= 1;
        }
    }
}
