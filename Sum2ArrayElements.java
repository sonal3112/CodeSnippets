import java.util.HashSet;

public class Sum2ArrayElements {
	
	public static void Sum2Elements(int[] A, int sum)
	{
		int l = A.length;
		//HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i =0; i<l ; i++)
		{
			int diff = sum - A[i];
			if(set.contains(diff))
				System.out.println(A[i]+" "+diff);
			else set.add(A[i]);
		}
	}
	
	public static void main(String[] args)
	{
		int sum = 5;
		int[] A = new int[]{1,3,2,4,1,5,7,6};
		
		Sum2Elements(A,sum);
		
	}

}
