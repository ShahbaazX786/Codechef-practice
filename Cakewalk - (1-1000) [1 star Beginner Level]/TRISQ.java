/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, a;
        t = sc.nextInt();
        while (t > 0) {
            a = sc.nextInt();
            a = a / 2 - 1;
            a = (a * (a + 1)) / 2;

            System.out.println(a);
            t -= 1;
        }
    }
}
