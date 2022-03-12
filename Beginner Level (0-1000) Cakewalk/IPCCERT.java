/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n, m, k, ans = 0;
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        while (n-- > 0) {
            int temp = 0;
            int a[] = new int[k + 1];
            for (int i = 0; i <= k; i++) {
                a[i] = sc.nextInt();
                if (i == k) {
                    continue;
                } else {
                    temp += a[i];
                }
            }
            if (temp >= m && a[k] <= 10) {
                ans += 1;
            } else {
                ans = ans;
            }
        }
        System.out.println(ans);
    }
}