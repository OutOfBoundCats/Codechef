package Main;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ISHVALA {
//https://www.codechef.com/problems/ISHVALA
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Long T;
		T=sc.nextLong();
		while(T-->0)
		{
			long N,M,X,Y,S;
			N=sc.nextLong();
			M=sc.nextLong();
			X=sc.nextLong();
			Y=sc.nextLong();
			S=sc.nextLong();
			long[] x1=new long[(int) X];
			long[] y1=new long[(int) Y];
			for(int i=0;i<X;i++)
			{
				x1[i]=sc.nextLong();
				//System.out.println("The x "+i+" is"+x1[i]);
			}
			for(int i=0;i<Y;i++)
			{
				y1[i]=sc.nextLong();
				//System.out.println("The y "+i+" is"+y1[i]);
			}
			//calculate summation a//s
			//int[] ai=new int[(int) X];
			int add_hr=0;
			int add_vr=0;
			//int[] bi=new int[(int) Y];
			int a1=0,b1=0;
			//horizontal rivers
			for(int i=0;i<X;i++)
			{
				int check=(int) (x1[i]-a1-1);
				if(check >=S)
				{
					add_hr+=check/S;
				}
				a1=(int) x1[i];
			}
			//when there are still rows remaining even after the last horizontal river
			if((N-a1)>=S)
			{
				add_hr+=(N-a1)/S;
			}
			
			//vertical rivers
			for(int i=0;i<Y;i++)
			{
				int check=(int) (y1[i]-b1-1);
				if(check >=S)
				{
					add_vr+=check/S;
				}
				b1=(int) y1[i];
			}
			//when there are still rows remaining even after the last horizontal river
			if((M-b1)>=S)
			{
				add_vr+=(M-b1)/S;
			}
			System.out.println(add_vr*add_hr);
			
			
//			long matrix[][]=new long[(int) N][(int) M];
//			//initialize to 0
//			for(int i=0;i<N;i++)
//			{
//				for(int j=0;j<M;j++)
//				{
//					matrix[i][j]=0;
//				}
//			}
//			//initilize complete
//			//initialize horizontal rivers as 1
//			for(int i=0;i<X;i++)
//			{
//				for(int j=0;j>M;j++)
//				{
//					matrix[(int) x1[i]][j]=1;
//				}
//			}
//			//initiliaze colums vertical columns
//			for(int i=0;i<Y;i++)
//			{
//				for(int j=0;j>N;j++)
//				{
//					matrix[j][(int) y1[i]]=1;
//				}
//			}
			

		}
	}

}
