class count 
{
	public static void main(String[] args) 
	{
		String s1 ="abc";
		String s2 ="aabbcc";
		for (int i=0; i<s1.length(); i++)
		{
			int count=0;
			for (int j=0; j<s2.length(); j++)
			{
				if (s1.charAt(i)==s2.charAt(j))
				{
					count++;
				}
				else 
				{
					return ;
				}
				System.out.print("Equlse"+count);
			}
		}
	}
}
