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
            m %= 4;
            switch (m) {
                case 0:
                    System.out.println("North");
                    break;
                case 1:
                    System.out.println("East");
                    break;
                case 2:
                    System.out.println("South");
                    break;
                case 3:
                    System.out.println("West");
                    break;
            }
            t -= 1;
        }
    }
}