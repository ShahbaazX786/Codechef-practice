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
            if (a >= 1 && a < 100) {
                System.out.println("Easy");
            } else if (a >= 100 && a < 200) {
                System.out.println("Medium");
            } else if (a >= 200 && a <= 300) {
                System.out.println("Hard");
            }
            t -= 1;
        }
    }
}