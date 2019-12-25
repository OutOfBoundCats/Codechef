package Main;

//https://www.codechef.com/problems/SAFEROBO
import java.util.*;
import java.lang.*;
import java.io.*;
class saferobo
{
	public static void main (String[]args) throws IOException
	{
	int T = 0;
	//Scanner sc = new Scanner (System.in);
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	 
	//T=sc.nextInt();
	String T1=br.readLine();
	if(T1 !=null) {
	 T = Integer.parseInt(T1);}
	try {
	while(T-- > 0)
	{
		int A_place = 0, B_place = 0;
		String S;
		int sa, sb;
		//S=sc.nextLine();
		S = br.readLine ();
		//sa=sc.nextInt();
		String sa1=br.readLine();
		sa = Integer.parseInt(sa1.split(" ")[0]);
		//sb=sc.nextInt();
		//String sb1=br.readLine();
		sb = Integer.parseInt(sa1.split(" ")[1]);
		int len = S.length ();
		int[] arr = new int[len];
		@SuppressWarnings("deprecation")
		Character a1 = new Character ('A');
		Character b1 = new Character ('B');
		Character c1 = new Character ('.');
		
		//find the place of A and B
		for (int i = 1; i <= len; i++)
		{
			char a = S.charAt (i - 1);
			if (a == c1)
			{
			arr[i - 1] = 0;
			
			}
			if (a == a1)
			{
			arr[i - 1] = 1;
			A_place = i;
			}
			if (a == b1)
			{
			arr[i - 1] = 2;
			B_place = i;
			}
		}
		//found place of A and B
		int dist = B_place - A_place;
		while (A_place < B_place)
		{
		A_place = A_place + sa;
		B_place = B_place - sb;
		if (A_place == B_place)
		{
		System.out.println ("unsafe");
		}else if (A_place > B_place)
		{
		System.out.println ("safe");
		}
	
		}
	
	}
	}catch(NumberFormatException e){
		
	}
	}
}

