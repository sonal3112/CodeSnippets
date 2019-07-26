
public class subarrayWithGivenSum {
	
	public static void getSubarray(int[] A, int sum)
	{
		int n = A.length;
		int curSum = A[0];
		int start = 0,i;
		
		for(i=1;i<n;i++)
		{
			while(curSum>sum && start<i-1)
			{
				curSum=curSum-A[start];
				start++;				
			}
			if(curSum==sum)
			{
				int p = i-1;
				System.out.println("Subarray between "+A[start]+" and "+A[p]);
			}
			if(i<n)
				curSum=curSum+A[i];
		}
		
	}

	public static void main(String[] args)
	{
		int[] A = {3,5,6,3,1,2,8,9,1,2,0,4};
		int sum = 10;
		
		getSubarray(A,sum);
	}
}	