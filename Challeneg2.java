package Challenges;


public class Challeneg2 {
	
	public static int SquareRoot(int x)
{
    double sqr = Math.sqrt(x);
    int result = (int) (sqr);
    return result;
}

public static void main(String[] args)
{
    int x = 8;
    System.out.print(SquareRoot(x));
}
}

