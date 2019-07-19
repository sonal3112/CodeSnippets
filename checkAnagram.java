import java.util.Arrays;
import java.util.HashMap;

public class checkAnagram {

	public static boolean isAnagram(String s1 , String s2)
	{
		int l1 = s1.length();
		int l2 = s2.length();
		if (l1!=l2) return false;
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		int[] count1 = new int[256];
		int[] count2 = new int[256];
		
		Arrays.fill(count1, 0);
		Arrays.fill(count2, 0);

		for (int i = 0; i < l1; i++)
			{ 
				count1[c1[i]]++;
				count2[c2[i]]++;
			}
			  	
		for (int i = 0; i < 256; i++)
			if (count1[i]!=count2[i]) return false;
        
		return true;		
	}
	
	public static boolean isAnagram1(String s1 , String s2)
	{
		int l1 = s1.length();
		int l2 = s2.length();
		if (l1!=l2) return false;
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		int[] count = new int[256];
				
		Arrays.fill(count, 0);

		for (int i = 0; i < l1; i++)
			{ 
				count[c1[i]]++;
				count[c2[i]]--;
			}
			  	
		for (int i = 0; i < 256; i++)
			if (count[i]!=0) return false;
        
		return true;		
	}
	
	public static boolean isAnagram2(String s1 , String s2)
	{
		int l1 = s1.length();
		int l2 = s2.length();
		if (l1!=l2) return false;
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> h2 = new HashMap<Character, Integer>();

		for (int i = 0; i < l1; i++)
			{ 
				if (h1.get(c1[i])!= null)
						h1.put(c1[i], h1.get(c1[i])+1);
				else
					h1.put(c1[i], 1);
			}
			  	
		for (int i = 0; i < l2; i++)
		{ 
			if (h2.get(c2[i])!= null)
					h2.put(c2[i], h2.get(c2[i])+1);
			else
				h2.put(c2[i], 1);
		}
		
		if(h1.equals(h2)) return true;
		return false;		
	}
	
	public static boolean isAnagram3(String s1 , String s2)
	{
		int l1 = s1.length();
		int l2 = s2.length();
		if (l1!=l2) return false;
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
				  	
		for (int i = 0; i < l1; i++)
			if (c1[i]!=c2[i]) return false;
        
		return true;		
	}
	
	public static void main(String[] args) {
		String s1 = "SILENTN";
		String s2 = "LISTENW";
		
		boolean bool = isAnagram(s1,s2);
		if (bool== true)
			System.out.println(s1 +" and "+s2+" are Anagrams");
		else
			System.out.println(s1 +" and "+s2+" are not Anagrams");
		
		boolean bool1 = isAnagram1(s1,s2);
		if (bool1== true)
			System.out.println(s1 +" and "+s2+" are Anagrams");
		else
			System.out.println(s1 +" and "+s2+" are not Anagrams");
		
		boolean bool2 = isAnagram2(s1,s2);
		if (bool2== true)
			System.out.println(s1 +" and "+s2+" are Anagrams");
		else
			System.out.println(s1 +" and "+s2+" are not Anagrams");
		
		boolean bool3 = isAnagram3(s1,s2);
		if (bool3== true)
			System.out.println(s1 +" and "+s2+" are Anagrams");
		else
			System.out.println(s1 +" and "+s2+" are not Anagrams");
	}

}
