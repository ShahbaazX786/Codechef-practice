/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            int a[] = new int[10], t1 = 0, t2 = 0;
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    t1 += sc.nextInt();
                } else {
                    t2 += sc.nextInt();
                }
            }
            System.out.println(t1 == t2 ? 0 : (t1 > t2 ? 1 : 2));
        }
    }
}