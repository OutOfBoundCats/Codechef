package Main;
//https://www.codechef.com/LTIME79B/problems/CHEALG
import java.util.*;
import java.lang.*;
import java.io.*;
public class CHEALG {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String T_in=br.readLine();
		int T=Integer.parseInt(T_in);
		while(T-- >0) 
		{
			String S=br.readLine();
			int len=S.length();
			//System.out.println("len is "+len);
			String[] S_arr=S.split("");
//			for(int p=0;p<len;p++) {
//				System.out.println(S_arr[p]);
//			}
			String[] S_new=new String[len];
			String ans = "";
			int sum=1;
			for(int i=0;i<len;i++) 
			{
				//System.out.println("in for loop "+S_arr[i]);
				if( ((i+1) < len) && S_arr[i].equals(S_arr[i+1]) )
				{
					//System.out.print(i+" and "+(i+1)+" are same");
					sum=sum+1;
					//System.out.println("sum is "+sum);
					continue;
				}else {
					//ans.concat(S_arr[i]);
					ans=ans+S_arr[i];
					ans=ans+sum;
					
					sum=1;
				}
				
				
			}
			//System.out.println(ans+"len"+ans.length());
			if(ans.length()<len) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

	}

}
