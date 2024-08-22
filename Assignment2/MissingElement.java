package Assignment2;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
	
		int[] arr={1,4,3,2,8,6,7}; 
		Arrays.sort(arr);
		int n=arr.length;	
		int sum=0; 
		
		int sum1;
	     
		for (int i=0; i<arr.length-1;i++) {
			sum += arr[i];
		}
			sum1= n*(n+1)/2;
			
			 int m= sum1-sum;
			

			 System.out.println("The missing number is = " +m);
	          
		}
	}
		

		


	
