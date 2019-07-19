
public class QuickSort {
	
	public static void quicksort(int[] A, int lo, int hi)
	{
		if(lo<hi)
		{
		int pi = partition(A,lo,hi);
		quicksort(A,lo,pi-1);
		quicksort(A,pi+1,hi);
		}
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
		int[] A = {2,5,7,3,4,1,9,5,0};
		int n = A.length;	
		for(int i=0;i<n;i++)
			System.out.print(A[i]+" ");
		
		quicksort(A,0,n-1);	
		
		System.out.println("");
		for(int i=0;i<n;i++)
			System.out.print(A[i]+" ");
		
		
	}

}
