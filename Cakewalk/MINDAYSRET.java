/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        while (n-- > 0) {
            double h, x;
            h = sc.nextInt();
            x = sc.nextInt();
            h = Math.ceil(h / x);
            System.out.println((int) h);
        }
    }
}