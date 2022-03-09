/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, a[] = new int[6];
        t = sc.nextInt();
        while (t > 0) {
            for (int i = 0; i < 6; i++) {
                a[i] = sc.nextInt();
            }
            if (a[1] >= a[0] && a[3] >= a[2] && a[5] <= a[4]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t -= 1;
        }
    }
}