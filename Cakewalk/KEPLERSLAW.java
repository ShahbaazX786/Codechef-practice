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
        double a[] = new double[4];
        t = sc.nextInt();
        while (t > 0) {
            for (int i = 0; i < 4; i++) {
                a[i] = sc.nextDouble();
            }
            a[0] = ((Math.pow(a[0], 2)) / (Math.pow(a[2], 3)));
            a[1] = ((Math.pow(a[1], 2)) / (Math.pow(a[3], 3)));
            System.out.println(a[0] == a[1] ? "YES" : "NO");
            t -= 1;
        }
    }
}
