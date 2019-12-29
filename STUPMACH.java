package Main;
import java.util.*;
import java.lang.*;
import java.io.*;

public class STUPMACH {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String T_in=br.readLine();
		int T=Integer.parseInt(T_in);
		while(T-- >0) 
		{
			int N;
			String N_in=br.readLine();
			N=Integer.parseInt(N_in);
			int[] arr=new int[N];
			int min=0;
			long sum=0;
			String arr_in=br.readLine();
			String[] arr1=arr_in.split(" ");
			for(int i=0;i<N;i++)
			{
				
				arr[i]=Integer.parseInt(arr1[i]);

			}
			min=arr[0];
			sum=min;
			for(int i=1;i<N;i++)
	        {
	           if(arr[i]<min)
	           min=arr[i];
	         
	           sum=sum+min;
	        
	        } 
			
			System.out.println(sum);
			}
			
			
			}
			
			
		}
	


