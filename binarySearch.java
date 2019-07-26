
public class binarySearch {

	public static int binary(int[] A, int lo, int hi,int e)
	{
		if(hi>=lo)
		{
			int mid = lo + (hi-lo)/2;
			if(A[mid]==e)
				return mid;
			else if(A[mid]>e)
				return binary(A,lo,mid-1,e);
			else
				return binary(A,mid+1,hi,e);
		}
		return -1;
	}
	
	public static int binaryIterative(int[] A, int lo, int hi,int e)
	{
		while(hi>=lo)
		{
			int mid = lo + (hi-lo)/2;
			if(A[mid]==e)
				return mid;
			else if(A[mid]>e)
				hi = mid-1;
			else
				lo=mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] A = {1,2,4,5,6,9,11,13,17,20};
		int ele = 6;
		int n = A.length;
		int lo = 0, hi= n-1;
		
		int res = binary(A,lo,hi,ele);
		if(res==-1) System.out.println(ele+" is not present in the array");
		else	System.out.println(ele+" present at index "+res);
		
		int res1 = binaryIterative(A,lo,hi,ele);
		if(res1==-1) System.out.println(ele+" is not present in the array");
		else	System.out.println(ele+" present at index "+res1);
		
	}
}
