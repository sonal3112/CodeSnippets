
public class uglyNumber {
	
	public static int getUgly(int n)
	{
		int[] ugly = new int[n];
		ugly[0] = 1;
		int m2 = 2, m3 = 3 , m5 = 5;
		int i2 =0 , i3 =0 , i5 = 0;
		int min =1;
		
		for (int i =1; i<n ; i++)
		{
			min = Math.min(Math.min(m2,m3), m5);
			System.out.println(min);
			ugly[i] = min;
			
			if(min==m2)
			{
				i2 = i2+1;
				m2 = ugly[i2]*2;				
			}
			
			else if(min==m3)
			 {
				i3 = i3+1;
				m3 = ugly[i3]*3;				
			 }
			 		
			else if(min==m5)
			{ 
				i5 = i5+1;
				m5 = ugly[i5]*5;				 
			}			
		}
		
		return min;
	}

	public static int min(int a , int b)
	{
		return (a<b)?a:b;
	}
	public static void main (String[] args)
	{
		int n = 10;
		int ugly = getUgly(n);
		System.out.println(n+"th ugly number is: "+ugly);
	}
	
}
