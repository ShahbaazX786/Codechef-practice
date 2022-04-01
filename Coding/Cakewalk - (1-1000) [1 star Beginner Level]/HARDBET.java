/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, a, b, c;
        t = sc.nextInt();
        while (t > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a < b && a < c) {
                System.out.println("Draw");
            } else if (b < a && b < c) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
            t -= 1;
        }
    }
}