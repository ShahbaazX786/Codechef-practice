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
            char a[] = sc.next().toCharArray();
            char b[] = sc.next().toCharArray();
            for (int i = 0; i < 5; i++) {
                if (a[i] == b[i]) {
                    System.out.print("G");
                } else {
                    System.out.print("B");
                }
            }
            System.out.println();
        }
    }
}