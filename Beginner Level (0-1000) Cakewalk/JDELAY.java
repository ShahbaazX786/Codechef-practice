/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, n, r, i;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            int s1[] = new int[n];
            int s2[] = new int[n];
            int temp = 0;
            for (i = 0; i < n; i++) {
                s1[i] = sc.nextInt();
                s2[i] = sc.nextInt();
            }
            for (i = 0; i < n; i++) {
                if ((s2[i] - s1[i]) > 5) {
                    temp += 1;
                }
            }
            System.out.println(temp);
        }
    }
}