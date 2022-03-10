/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, k, x;
        t = sc.nextInt();
        while (t-- > 0) {
            int temp = 0;
            k = sc.nextInt();
            x = sc.nextInt();
            int a[] = new int[k];
            for (int i = 0; i < k; i++) {
                a[i] += sc.nextInt();
                if (a[i] < x) {
                    temp = i + 1;
                }
            }
            System.out.println(temp);
        }
    }
}
