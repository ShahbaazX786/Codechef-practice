/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, n;
        t = sc.nextInt();
        while (t > 0) {
            n = sc.nextInt();
            if (n < 1600) {
                System.out.println("3");
            } else if (n >= 1600 && n < 2000) {
                System.out.println("2");
            } else if (n >= 2000) {
                System.out.println("1");
            }
            t -= 1;
        }
    }
}
