package Assignment2;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 7;
		int i, num=0, flag=0;
		num=n/2;
		System.out.println("Enter a Number =" +n);
		if (num<=0)
			System.out.println("Invalid Number");
		else {
			
		for ( i=2; i<=num; i++) {
			
			if (n%i==0) {
				System.out.println(n+ "is not a Prime Number");
				flag=1;
			}
					
		}
		if (flag==0)	{
		System.out.println( n+ " is a Prime Number" );
			
		}			
			
		}
	}
}
