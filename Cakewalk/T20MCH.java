/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here\\
        Scanner sc = new Scanner(System.in);
        int r, o, c;
        r = sc.nextInt();
        o = sc.nextInt();
        c = sc.nextInt();
        o = 20 - o;
        o *= 6;
        o *= 6;
        c += o;
        System.out.println(c > r ? "YES" : "NO");

    }
}
