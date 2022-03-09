/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, x;
        char a[] = new char[14];
        t = sc.nextInt();
        while (t > 0) {
            x = sc.nextInt();
            int n = 0, c = 0;
            a = sc.next().toCharArray();
            for (int i = 0; i < 14; i++) {
                if (a[i] == 'C') {
                    c += 2;
                } else if (a[i] == 'N') {
                    n += 2;
                } else if (a[i] == 'D') {
                    c += 1;
                    n += 1;
                }
            }
            if (n > c) {
                System.out.println(40 * x);
            } else if (c > n) {
                System.out.println(60 * x);
            } else if (c == n) {
                System.out.println(55 * x);
            }
            t -= 1;
        }
    }
}
