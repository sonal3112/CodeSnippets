
public class findCommonin3SortedArray {

	public static void getCommon(int[] A, int[] B, int[] C)
	{
		int x=0,y=0,z=0;
		
		while(x<A.length && y<B.length && z<C.length)
		{
			if(A[x]==B[y] && B[y]==C[z])
			{	
				System.out.println(A[x]);
				x++;
				y++;
				z++;
			}
			else if(A[x]>B[y]) y++;
			else if(B[y]>C[z]) z++;
			else x++;
		}
	}
	
	public static void main(String[] args)
	{
		int[] A = {1,2,4,5,7,8};
		int[] B = {1,3,6,8,10,12};
		int[] C = {1,2,4,5,6,8,9};
		
		getCommon(A,B,C);
	}
}
