import java.util.Arrays;

public class pythagorianTriplets {
	
	public static void getTriplets(int[] A)
	{
		int n = A.length;
		for(int i = 0; i<n; i++)
			A[i]=A[i]*A[i];
		
		Arrays.sort(A); 
		for(int i = n-1;i>=2;i--)
		{
			int lo = 0;
			int hi = i-1;
			
			while(lo<hi)
			{
			if(A[lo]+A[hi]==A[i])
			System.out.println("Pythagorian Tripletss found: "+Math.sqrt(A[lo])+" "+Math.sqrt(A[hi])+" "+Math.sqrt(A[i]));	
					
			if(A[lo]+A[hi]<A[i]) lo++;
			else hi--;
			}
		}			
	}
	

	public static void main(String[] args)
	{
		int[] A = {3,5,6,13,12,8,9,0,4};	
		getTriplets(A);
	}

}
