
public class minMaxArray {
	
	public static int[] minMax(int[] A)
	{
		int[] res = new int[2];
		int n = A.length;
		int i=0;
		
		if(n%2 != 0)
		{
			res[0]=res[1]=A[0];
		}
		else
		{
			if(A[0]<A[1])
			{
				res[0] = A[0];
				res[1] = A[1];
			}
			else	
			{
				res[0] = A[1];
				res[1] = A[0];
			}
			i=1;
		}
		
		for(++i; i<n; i=i+2)
		{
			if(A[i]<A[i+1])
			{
				if(res[0]>A[i]) res[0] = A[i];
				if(A[i+1]>res[1]) res[1] = A[i+1];
			}
			else
				{
					if(res[0]>A[i+1]) res[0] = A[i+1];
					if(A[i]>res[1]) res[1] = A[i];
				}
		}
		return res;
	
	}

	public static void main(String[] args)
	{
		int[] A = {-35,1,200,84,5,45,3,-1,33,8,100,33};
		int[] res = minMax(A);
		
		System.out.println("Min Element is:"+ res[0]);
		System.out.println("Max Element is:"+ res[1]);
		
	}
}
