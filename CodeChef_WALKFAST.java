//link https://www.codechef.com/problems/WALKFAST

package Main;
import java.util.*;
import java.io.*;

public class CodeChef_WALKFAST {
	


	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int time=0;
			int n,a,b,c,d,p,q,y;
			n=sc.nextInt();
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			p=sc.nextInt();
			q=sc.nextInt();
			y=sc.nextInt();
			int arr[]=new int [n+1];
			//System.out.println("valkue of n:"+n);
			for(int j=1;j<=n;j++) 
			{
				arr[j]=sc.nextInt();
			}
			if(p<=q) 
			{
				time=(Math.abs(arr[b]-arr[a]))*p;
			}else {
				int one=(Math.abs(arr[b]-arr[a]))*p;
				int atoc=(Math.abs(arr[a]-arr[c]))*p;
				if(atoc<=y)
				{
				    int ans=0;
				    //System.out.println(c+"arr[c "+arr[c]);
					int ctod=(Math.abs(arr[c]-arr[d]))*q;
					int dtob=(Math.abs(arr[d]-arr[b]))*p;
					ans=ctod+dtob+y;
					time= Math.min(ans, one);
					
				}
				else {
					time= (Math.abs(arr[b]-arr[a]))*p;
				}
				
			}
			System.out.println(time);
			
		}
		
		
	}

}
