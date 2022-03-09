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
		Scanner sc=new Scanner(System.in);
		int t,a1,a2,b1,b2,c1,c2;
		t=sc.nextInt();
		while(t>0){
		    a1=sc.nextInt();
		    a2=sc.nextInt();
		    b1=sc.nextInt();
		    b2=sc.nextInt();
		    c1=sc.nextInt();
		    c2=sc.nextInt();
		    a1+=a2;
		    b1+=b2;
		    c1+=c2;
		    if(a1>b1 && a1>c1){
		        System.out.println(a1);
		    }
		    else if (b1>a1 && b1>c1){
		        System.out.println(b1);
		    }
		    else{
		        System.out.println(c1);
		    }
		    t-=1;
		}
	}
}
//hehe