/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc  = new Scanner(System.in);
		int t,a[]=new int[2];
		t=sc.nextInt();
		while(t>0){
		    for (int i=0;i<2;i++){
        		a[i]=sc.nextInt();
		    }
		    a[0]=(a[0]/(a[1]*a[1]));
		    if(a[0]<=18){
        		System.out.println(1);
		    }else if (a[0]>18 && a[0]<25){
        		System.out.println(2);
		    } 
		    else if (a[0]>24 && a[0]<30){
        		System.out.println(3);
		    }
		    else if (a[0]>29){
        		System.out.println(4);
		    }
		    t-=1;
		}
	}
}