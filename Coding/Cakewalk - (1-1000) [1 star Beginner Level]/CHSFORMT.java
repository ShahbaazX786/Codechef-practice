/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, a, b;
        t = sc.nextInt();
        while (t > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            a += b;
            if (a < 3) {
                System.out.println(1);
            } else if (a >= 3 && a <= 10) {
                System.out.println(2);
            } else if (a >= 11 && a <= 60) {
                System.out.println(3);
            } else {
                System.out.println(4);
            }
            t -= 1;
        }
    }
}