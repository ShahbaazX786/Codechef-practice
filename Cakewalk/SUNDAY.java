/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, x, temp, s;
        t = sc.nextInt();
        while (t-- > 0) {
            x = sc.nextInt();
            s = 8 + x;
            for (int i = 0; i < x; i++) {
                temp = 0;
                temp = sc.nextInt();
                if (temp % 7 == 0 || temp % 7 == 6) {
                    s--;
                }
            }
            System.out.println(s);
        }
    }
}
