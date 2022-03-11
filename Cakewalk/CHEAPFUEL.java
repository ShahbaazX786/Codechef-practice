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
        t = sc.nextInt();
        while (t-- > 0) {
            int temp = 0;
            int a[] = new int[5];
            for (int i = 0; i < 5; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < a[4]; i++) {
                a[0] += a[2];
                a[1] += a[3];
            }
            if (a[0] == a[1]) {
                System.out.println("SAME PRICE");
            } else {
                System.out.println(a[0] > a[1] ? "DIESEL" : "PETROL");
            }
        }
    }
}