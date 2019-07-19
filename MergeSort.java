
public class MergeSort {
	
	public static void mergesort(int[] A, int left , int right)
	{
		if(left<right)
		{
			int mid = (left+right)/2;
			mergesort(A, left,mid);
			mergesort(A,mid+1,right);
			
			merge(A,left,mid,right);
		}
	}

	public static void merge(int[] A, int left, int mid, int right)
	{
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for (int i=0; i<n1;i++)
			L[i] = A[left+i];
		
		for (int j=0;j<n2;j++)
			R[j] = A[mid+j+1];
		
		int i=0,j=0,k=left;
		
		while(i<n1 && j<n2)
		{
			if (L[i]<=R[j])
				{ A[k]=L[i]; i++; }
			else
				{ A[k]=R[j]; j++; }
			k++;
		}
		
		while(i<n1)
		{
			A[k]=L[i];
			k++; i++;
		}
		
		while(j<n2)
		{
			A[k]=R[j];
			k++; j++;
		}
		
	}
	public static void main(String[] args)
	{
		int[] A = {2,5,7,3,4,1,9,5,0};
		int n = A.length;	
		for(int i=0;i<n;i++)
			System.out.print(A[i]+" ");
		
		mergesort(A,0,n-1);	
		
		System.out.println("");
		for(int i=0;i<n;i++)
			System.out.print(A[i]+" ");
		
		
	}

}
