class StringInterview 
{
	public static void main(String[] args) 
	{
		String s1 ="abcd";
		String s2 ="dcba";
		int s1Length = s1.length();
		int s2Length = s2.length();
		boolean flag = true;
		if (s1Length==s2Length)
		{
			for (int i=0; i<s1Length; i++)
			{
				char ch1= s1.charAt(i);
				int c=0;
				for (int j=0; j<s2Length; j++)
				{
					char ch2=s2.charAt(j);
					if (ch1==ch2)
					{
						c++;
						break;
					}
				}
				if (c==0)
				{
					flag=false;
					System.out.println("String Are Not Anagram");
				}
			}
			if (flag==true)
			{
				System.out.println("String Are Anagram");
			}
		}
		else
		{
			System.out.println("String Are Not Anagram");
		}
	}
}
