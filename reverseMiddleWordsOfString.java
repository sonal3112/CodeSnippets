
public class reverseMiddleWordsOfString {
	
	public static void reverse(String s)
	{
		String first="";
		String last="";
		String mid="";
		int i,j,m;
		int len = s.length();
		
		for(i =0; i<len && s.charAt(i)!=' ';i++)
			first=first+s.charAt(i);
		
		for(j =len-1; j>0 && s.charAt(j)!=' ';j--)
			last=s.charAt(j)+last;
		
		System.out.println("First word of the string is:"+first);
		System.out.println("Last word of the string is:"+last);		
		
		for (m = j; m >= i; m--) 
			mid=mid+s.charAt(m);
		System.out.println("Mid word of the string is:"+mid);	
		
		System.out.println(first+mid+last);	
	}

	public static void main(String[] args)
	{
		String s = "I Love My India";
		reverse(s);
	}
}
