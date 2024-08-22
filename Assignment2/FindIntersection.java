package Assignment2;

public class FindIntersection {
	public static void main(String[] args) {
		int[] num1= {3,2,11,4,6,7};
		int[] num2= {1,2,8,4,9,7};
		
		System.out.println("Intersection of two arrays "  );
		
		 // To Find Intersection of two Arrays //
		int i,j;
		 for ( i=0;i<num1.length; i++) {
			 for (j=0; j<num2.length; j++) {
					 
          if(num1[i]==num2[j])
          {		
					 System.out.println(num2[j]);
          }
					 
          }
		 }
	}	 
		
	}

