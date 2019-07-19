
public class factorial {
	 
	public static int getFactorial(int n)
	{
		if (n == 0) return 0;
		if (n == 1) return 1;
		else
			return n*getFactorial(n-1);
	}

	public static int getFactorialItervative(int n)
	{
		int fact = 1;
		if (n == 0) return 0;
		if (n == 1) return 1;
		else			
			for (int i=2; i<=n ; i++)
			{
				fact = fact*i;
			}
		return fact;
	}

	public static void main(String[] args)
	{
		int n = 8;
		System.out.println("Factorial of "+n+" is : "+getFactorial(n));
		System.out.println("Factorial of "+n+" is : "+getFactorialItervative(n));
	}
}
