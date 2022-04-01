/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, t1, t2;
        int a1[] = new int[3];
        int a2[] = new int[3];
        t = sc.nextInt();
        while (t-- > 0) {
            t1 = 0;
            t2 = 0;
            for (int i = 0; i < 3; i++) {
                a1[i] = sc.nextInt();
                if (a1[i] == 1) {
                    t1 += 1;
                }
            }
            for (int i = 0; i < 3; i++) {
                a2[i] = sc.nextInt();
                if (a2[i] == 1) {
                    t2 += 1;
                }
            }
            System.out.println(t1 == t2 ? "Pass" : "Fail");
        }
    }
}