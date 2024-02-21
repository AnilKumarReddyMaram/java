import java.util.*;
class pa 
{
	public static void main(String[] args) 
	{
		String s="abcdABCDabcd";
		Map<Character, Integer>map=new HashMap<>();
		for (int i=0; i<s.length(); i++)
		{
			char ch1=s.charAt(i);
			int count=0;
			for (int j=0; j<s.length(); j++)
			{
				char ch2=s.charAt(j);
				if (ch1==ch2)
				{
					count++;
				}
			}
			map.put(ch1, count);
		}
		System.out.println(map);
	}
}
