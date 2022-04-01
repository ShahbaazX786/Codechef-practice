/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, temp, i;
        t = sc.nextInt();
        for (i = 0; i < t; i++) {
            int amin = sc.nextInt();
            int bmin = sc.nextInt();
            int cmin = sc.nextInt();
            int tmin = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a >= amin && b >= bmin && c >= cmin && a + b + c >= tmin)
                System.out.println("YES");
            else
                System.out.println("NO");
            /*
             * while(t-->0){
             * temp=0;
             * int a[]=new int[7];
             * for (i=0;i<7;i++){
             * a[i]=sc.nextInt();
             * }
             * for (i=0;i<7;i++){
             * System.out.print(a[i]+" ");
             * }
             * if(a[4]>=a[0] && a[5]>=a[1] && a[6]>=a[2] && a[0]+a[1]+a[2]>=a[3]){
             * System.out.println("YES");
             * }
             * else{
             * System.out.println("NO");
             * }
             * }
             */
        }
    }
}