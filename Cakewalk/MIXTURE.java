/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, temp, i;
        t = sc.nextInt();
        while (t-- > 0) {
            temp = 0;
            int a[] = new int[2];
            for (i = 0; i < 2; i++) {
                a[i] = sc.nextInt();
            }
            if (a[0] > 0 && a[1] > 0) {
                System.out.println("Solution");
            } else {
                System.out.println(a[0] == 0 ? "Liquid" : "Solid");
            }
        }
    }
}
