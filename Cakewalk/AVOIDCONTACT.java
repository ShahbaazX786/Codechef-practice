/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, x, y;
        t = sc.nextInt();
        while (t > 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (y == 0) {
                System.out.println(x);
            } else if (y < x && y > 0) {
                x = x - y;
                y *= 2;
                System.out.println(x + y);
            } else if (x == y) {
                System.out.println((y * 2) - 1);
            }
            t -= 1;
        }
    }
}