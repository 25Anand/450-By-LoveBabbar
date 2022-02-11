import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++){
		    
		    int M=sc.nextInt();
		    
		    int arr[]=new int[M];
		    
		    for(int j=0;j<M;j++){
		        
		        arr[j]=sc.nextInt();
		    }
		    for(int j=M-1;j>=0;j--){
		        
		        System.out.print(arr[j]+" ");
		    }
		    System.out.println();
		}
	}
}
