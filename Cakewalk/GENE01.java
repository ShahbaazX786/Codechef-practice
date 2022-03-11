/* package codechef; // don't place package name! */

import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        char a, b;
        a = sc.next().charAt(0);
        b = sc.next().charAt(0);
        if (a == b) {
            System.out.println(a);
        } else if (a == 'R' || b == 'R') {
            System.out.println('R');
        } else if (a == 'B' || b == 'B') {
            System.out.println('B');
        }
    }
}