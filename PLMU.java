package Main;
import java.util.*;
import java.lang.*;
import java.io.*;
//https://www.codechef.com/problems/PLMU
public class PLMU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int T;
		T=in.nextInt();
		//System.out.println("T is "+T);
		int[] pairs=new int[T];
		int e=0;
		while(T-->0) 
		{
			
			int N;
			int i=0;
			N=in.nextInt();
			//System.out.println("N is "+N);
			int k=N;
			int[] arr=new int[N];
			while(k-->0)
			{
				if(k==N)
				{
					i=0;
				}
				arr[i]=in.nextInt();
				//System.out.println("input for"+i+" is "+arr[i]);
				i++;
				
			}
			i=0;
			k=N;
			//calculate apperances
			for(int j=0;j<N-1;j++)
			{
				//System.out.println(j+" th loop");
				if(j==0) 
				{
					e=0;
				}
				for(int o=j+1;o<N;o++)
				{
					if((arr[j]+arr[o])==(arr[j]*arr[o]))
					{
						e++;
						//System.out.println("Found stuff "+arr[j]+" and "+arr[o]+" match");
					}
				}
				
				if(j==N-1-1) 
				{
					/*
					 * if(e==0) { System.out.println("found no stuff"); }else {
					 * System.out.println("found "+e+" appearces"); }
					 */
					System.out.println(e);
					
				}
				
			}
			
			
		}
		
		
		
	}

}
