class StringRepeation 
{
	public static void main(String[] args) 
	{
		String s1 ="abc";
		String s2 ="aabbcc";
		boolean flag=true;
		for (int i=0; i<s1.length(); i++)
		{
			char ch1 =s1.charAt(i);
			int c=0;
			for (int j=0; j<s2.length(); j++)
			{
				char ch2 =s2.charAt(j);
				if (ch1==ch2)
				{
					c++;
					break;
				}
			}
			if (c==0)
			{
				flag=false;
				System.out.println("Failure");
			}
		}
		if (flag==true)
		{
			System.out.println("Success");
		}
	}
}