
public class pascalTriangle {
	
	public static void printPascalTriangle(int n)
	{
		int[][] A = new int[n][n];
		
		for (int l =0; l <n; l++)
		{
			for(int i=0; i<=l; i++)
			{
				if (i==0 || i==l)
					A[l][i] = 1;
				else 
					A[l][i] = A[l-1][i-1] + A[l-1][i];
				System.out.print(A[l][i]+" ");
			}
		System.out.println("");
		}
	}
	
	public static void main(String[] args)
	{
		int n = 7;
		printPascalTriangle(n);
	}
}
