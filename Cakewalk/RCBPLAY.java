/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, x, y, z;
        t = sc.nextInt();
        while (t > 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            y -= x;
            z *= 2;
            if (z >= y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t -= 1;
        }
    }
}
