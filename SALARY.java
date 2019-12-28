package Main;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SALARY {

	
	public static int findSumWithoutUsingStream(int[] array) {
	    int sum = 0;
	    for (int value : array) {
	        sum += value;
	    }
	    return sum;
	}
	public static void main(String[] args) throws IOException{
		//Scanner sc = new Scanner(System.in);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int m=testCases;
		//System.out.println("Test cases are "+testCases);
		while(testCases-- >0){
		   // System.out.println("Run "+(testCases-m));
		    int noOfUsers = Integer.parseInt(br.readLine());
		    //System.out.println("noOfUsers "+noOfUsers);
		    int salaries[] = new int[noOfUsers];
		    String salaries1=br.readLine();
	        String[] salaries3 = salaries1.split(" ");
	        for(int i=0;i<noOfUsers;i++)
            {
                salaries[i]=Integer.parseInt(salaries3[i]);
               // System.out.println("salary "+i+"is"+salaries[i]);
            }
		    int max = Arrays.stream(salaries).max().getAsInt(); 
		    //System.out.println("MAX "+max);
		    int min = Arrays.stream(salaries).min().getAsInt(); 
		    //System.out.println("MIN "+min);
		    int tries=0;
		    tries=findSumWithoutUsingStream(salaries)-noOfUsers*min;
		    System.out.println(tries);
		    
		    
		}
		
		
		
	}
	
}
