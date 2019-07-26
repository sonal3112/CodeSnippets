
public class reverseWordsInString {
	
	public static void reverse(String s)
	{
		String str[] = s.split(" ");
		for(int i=str.length-1;i>=0;i--)
			System.out.print(str[i]+" ");
	}

	public static void main(String[] args)
	{
		String s = "I Love India";
		reverse(s);
	}
}
