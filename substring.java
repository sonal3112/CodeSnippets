
public class substring {
	
	public static void getString(String s1, String s2)
	{
		int n1= s1.length();
		int n2 = s2.length();
		
		for(int i = 0 ; i<=n1-n2; i++)
		{ 
			int j;
			for(j=0;j<n2;j++)
			{
				if(s1.charAt(i+j)!=s2.charAt(j))
				break;
			}
			if(j==n2)
			System.out.println("Found at index"+i);
		}
		
	}
	public static void main(String[] args)
	{
		String s1 = "geekforgeeksfor";
		String s2 = "for";
		
		getString(s1,s2);
	}

}
