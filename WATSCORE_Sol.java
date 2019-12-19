package Main;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

//https://www.codechef.com/DEC19B/problems/WATSCORE
class WATSCORE_Sol
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		while(m-->0){
		    int n=in.nextInt();
		 
		    int[] a=new int[9];
		    int i;
		    for(i=0;i<n;i++){
		        int k=in.nextInt();
		        int j=in.nextInt();
		        if(k<9){
		         
		        if(k<9) a[k]=a[k]>j?a[k]:j;
		    }
		    }
		    int s=0;
		    for(i=1;i<=8;i++) s+=a[i];
		   System.out.println(s);
		}
	}
}
