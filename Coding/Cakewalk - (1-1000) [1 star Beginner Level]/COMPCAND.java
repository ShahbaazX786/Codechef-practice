/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, a, k;
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            k = sc.nextInt();
            if (a % k == 0) {
                System.out.println(a / k);
            } else {
                System.out.println(-1);
            }
        }
    }
}