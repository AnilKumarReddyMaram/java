import java.util.*;
class StringMethod 
{
	public static void main(String[] args) 
	{
		String s1="abcd";
		String s2="bcda";
		if (s1.length()==s2.length())
		{
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1,ch2))
			{
				System.out.println("String are Anagrams");
			}
			else
			{
				System.out.println("String are Not Anagrams");
			}
		}
		else
		{
			System.out.println("String are not Anagrams");
		}
	}
}
