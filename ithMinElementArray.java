
public class ithMinElementArray {

	public static int ithMin(int[] A, int lo , int hi , int i)
	{
		int res;
		
		int index = partition(A,lo,hi);
		
		if(index==i) res = index;
		else if(index<i)
			res = ithMin(A,index+1,hi,i);
		else
			res = ithMin(A,lo,index-1,i);
		
		return res;		
	}
	

	public static int partition(int[] A, int lo, int hi)
	{	
		int pivot = A[hi];
		int pi = lo-1;
		
		for(int i =lo;i<hi; i++)
		{
			if(A[i]<=pivot)
			{
				pi++;
				int temp1 = A[pi];
				A[pi] = A[i]; 
				A[i] = temp1;
			}
		}
		
		int temp2 = A[pi+1];
		A[pi+1] = A[hi];
		A[hi] = temp2;
		
		return pi+1;		
	}
	
	public static void main(String[] args)
	{
		int[] A = {1,2,3,4,5,6,7,8};
		int i = 7;
		int n = A.length;
		int res = ithMin(A,0,n-1,i-1);
		
		System.out.println(i+ "th Min Element in the Array is:"+ A[res]);
		
		
	}
}
