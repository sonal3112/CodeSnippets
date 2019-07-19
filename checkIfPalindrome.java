
public class checkIfPalindrome {

	public static int reverse(int n)
	{
		int temp = 0;
		while (n > 0)
		{
			temp = (temp*10) + (n%10);
			n = n/10;
		}
		return temp;
	}
	
	public static void main(String[] args)
	{
		int num = 3;
		int rev_num = reverse(num);
		
		if (num==rev_num)
			System.out.println(num+" is a Palindrome");
		else
			System.out.println(num+" is not a Palindrome");
	}
}
