package Main;
//https://www.codechef.com/LTIME79B/problems/EVIPRO
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;
import java.io.*;

public class EVIPRO {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String T_in=br.readLine();
		int T=Integer.parseInt(T_in);
		while(T-- >0) 
		{
			String S=br.readLine();
			
			String one="1";
			String zero="0";
			String U=S;
			int start=1;
			int len=U.length();
			//System.out.println(len);
			String[] U_arr=U.split("");
//			for(int i=0;i<len;i++) {
//				System.out.println(U_arr[i]);
//			}
			int sum=0;
			for(int i=0;i<len;i++) 
			{
				//System.out.println("i is "+i);
				//System.out.println(" ");
				for(int j=i;j<len;j++) 
				{
					U=S;
					U_arr=U.split("");
					//System.out.println("j is "+j);
					for(int q=i;q<=j;q++)
					{
						//System.out.println("q is from "+i+" to "+j);
						if(U_arr[q].equals(one)) 
						{
							//System.out.println("equals one");
							U_arr[q]=zero;
							//System.out.println(U_arr[j]);
						}else if(U_arr[q].equals(zero)) {
							U_arr[q]=one;
						}
					}
					
					
					
					//System.out.println(" ");
//					for(int p=0;p<len;p++) {
//						System.out.print(U_arr[p]);
//					}
					//System.out.println(" ");
					for(int p=0;p<len-1;p++) {
						if(U_arr[p].equals(U_arr[p+1])) {
							sum=sum+1;
						}
					}
					
					
				}
				//System.out.println("sum is:-"+sum);
				
				
			}
			
			//ans
			System.out.println(sum);
			
		}
		
	}

}
