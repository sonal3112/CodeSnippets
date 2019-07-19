
public class fibonacciSeries {

	public static int printFibonacciSeries(int n) //Dynamic Programming
	{
		int[] f = new int[n+2];
		f[0] = 0;
		f[1] = 1;
		System.out.print(f[0]+" ");
		System.out.print(f[1]+" ");
		for(int i=2; i<=n ; i++)
		{
			f[i] = f[i-1]+f[i-2];
			System.out.print(f[i]+" ");
		}
		return f[n];
		
	}
	

	public static int printFibonacciSeriesSpace(int n) //Space Optimized
	{
		int a=0 , b=1 , c;
		System.out.print(a+" ");
		System.out.print(b+" ");
		if ((n==0)||(n==1))
			 return n;
		for(int i=2; i<=n ; i++)
		{
			c=a+b;
			a= b;
			b = c;
			System.out.print(b+" ");
		}
		return b;
		
	}
	
	public static int printFibonacciSeriesRecursive(int n)
	{
		if ((n==0)||(n==1))
		 return n;
		else 
			return printFibonacciSeriesRecursive(n-1)+printFibonacciSeriesRecursive(n-2);	
	}
	
	
	public static void main(String[] args)
	{
		int n = 8;
		int fib1 = printFibonacciSeries(n);
		System.out.println("");
		System.out.println("Fibonacci Number for "+n+" is :"+fib1);
		int fib = printFibonacciSeriesRecursive(n);
		System.out.println("Fibonacci Number for "+n+" is :"+fib);
		
		int fib2 = printFibonacciSeriesSpace(n);
		System.out.println("");
		System.out.println("Fibonacci Number for "+n+" is :"+fib2);
			
	}
}
