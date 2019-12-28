package Main;
import java.util.*;
import java.io.*;
import java.lang.*;

public class RAINBOWA {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			int size = sc.nextInt();
			int[] array = new int[size];
			for (int j = 0; j < size; j++) {
				array[j] = sc.nextInt();
			}
			int start=0;
			int end=size-1;
			boolean flag=true;
			if(array[0]!=1){
			    System.out.println("no");
			    flag=false;   
			}
			while(start<end && flag){
			    if((array[start] == array[end]) && (array[start] == array[start + 1] || array[start] + 1 == array[start + 1])){
			        
			    }else{
			        System.out.println("no");
			        flag= false;
			        break;
			    }
			    end--;
			    start++;
			}
			if(array[start] !=7 && flag){
			    System.out.println("no");
			    flag=false;   
			}
			if(flag){
			    System.out.println("yes");
			}
			
		}

	}
}


