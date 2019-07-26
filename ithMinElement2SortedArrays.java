import java.util.Arrays;

public class ithMinElement2SortedArrays {
	
	public static int kthMin(int[] A, int m ,int[] B,  int n , int k)
	{
			
		if((m+n<k)|| k<1) return -1;
		
		if(m==0) return B[k-1];
		if(n==0) return A[k-1];
		
		if(m>n)
			return kthMin(B,n,A,m,k);
		
		if(k==1) return A[0]<B[0]?A[0]:B[0];
		
		int i = Math.min(m, k / 2); 
        int j = Math.min(n, k / 2); 
        
        if(A[i-1]>B[j-1])
        {   	
        		int temp[] = Arrays.copyOfRange(B, j, n); 
         		return kthMin(A,m,temp,n-j,k-j);
        }
        else {
        	int temp[] = Arrays.copyOfRange(A, i, m); 
     		return kthMin(temp,m-i,B,n,k-i);
        }
			
	}
	
	
	public static void main(String[] args)
	{
		int[] A = {10,23,24};
		int[] B = {1,4,6};

		int k = 3;
		int m = A.length;
		int n = B.length;
				
		int res = kthMin(A,m,B,n,k);
		
		System.out.println(k+ "th Min Element in these 2 sorted arrays is:"+res);
		
	}

}
