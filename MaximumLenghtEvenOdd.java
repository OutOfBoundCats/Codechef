
import java.util.*;
import java.lang.*;
import java.io.*;

public class MaximumLenghtEvenOdd {
	
	public static boolean even_check(int a){
		boolean result;
		if(a%2==0) {
			result=true;
		}else {
			result=false;
		}
		return result;
	}
	
	public static int sublong(int a[],int n) {
		
		int l=0;
		System.out.println("Initilaize sublong l="+l);
		int max=0;
		boolean even=false,odd=false;
		for(int i=1;i<n;i++) {
			if(even_check(a[i-1])==true && even_check(a[i])==false) {
				l++;
				max=Math.max(l, max);
			}else if(even_check(a[i-1])==false && even_check(a[i])==true) {
				l++;
				max=Math.max(l, max);
			}else if((even_check(a[i-1])==false && even_check(a[i])==false) || (even_check(a[i-1])==true && even_check(a[i])==true) ) {
				l=0;
			}
			
		}
		
		
		return l+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Initialize");
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int[] arr=new int[t];
		for(int i=0;i<t;i++) {
			arr[i]=sc.nextInt();
		}
		int l=sublong(arr,t);
		System.out.println(l+" :is the lenght of longest evenn odd sequence");
	}

}
