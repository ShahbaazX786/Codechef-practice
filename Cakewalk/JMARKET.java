
/* package codechef; // don't place package name! */
import java.util.*;
import java.util.Arrays;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, x;
        int a[] = new int[3];
        t = sc.nextInt();
        while (t > 0) {
            x = sc.nextInt();
            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            x -= 1;
            x = (a[0] * x) + (a[1] * 1);
            System.out.println(x);
            t -= 1;
        }
    }
}
