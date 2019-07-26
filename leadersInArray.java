
public class leadersInArray {
	
	public static void printLeaders(int[] A)
	{
		int n = A.length;
		
		int max_right = A[n-1];
		System.out.println(max_right);
		
		for (int i = n-2;i>=0 ;i--)
		{
			if (A[i]>max_right)
				{
					System.out.println(A[i]);
					max_right = A[i];
				}
		}
	}
	
	public static void main(String[] args)
	{
		int[] A = {1, 4 , 3, 2, 16, 8, 12, 9, 5 , 1,23, 20};
		printLeaders(A);
	}

}
