/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x, a[] = new int[5], temp = 0;
            for (int i = 0; i < 5; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) {
                    temp += 1;
                }
            }
            if (temp == 0) {
                System.out.println("Beginner");
            } else if (temp == 1) {
                System.out.println("Junior Developer");
            } else if (temp == 2) {
                System.out.println("Middle Developer");
            } else if (temp == 3) {
                System.out.println("Senior Developer");
            } else if (temp == 4) {
                System.out.println("Hacker");
            } else {
                System.out.println("Jeff Dean");
            }
        }
    }
}
