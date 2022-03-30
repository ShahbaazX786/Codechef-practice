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

            for (i = a[0]; i <= a[1]; i++) {
                if (i % 10 == 2 || i % 10 == 3 || i % 10 == 9) {
                    temp += 1;
                }

            }
            System.out.println(temp);
        }
    }
}