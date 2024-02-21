class CountChar
{
	public static void main(String[] args) 
	{
		String s="abcabc";
		int a=0;
		int b=0;
		int c=0;
		for (int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if (ch=='a')
			{
				a++;
			}
			else if (ch=='b')
			{
				b++;
			}
			else if (ch=='c')
			{
				c++;
			}
		}
		System.out.println("a:"+a+","+"b:"+b+","+"c:"+c);
	}
}
