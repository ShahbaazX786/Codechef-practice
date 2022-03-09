/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, m;
        t = sc.nextInt();
        while (t > 0) {
            m = sc.nextInt();
            if (m % 10 == 0) {
                System.out.println(m / 10);
            } else {
                System.out.println(m / 10 + 1);
            }
            t -= 1;
        }
    }
}
