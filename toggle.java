class toggle 
{
	static void toggleChars(char str[])
	{
		for (int i=0; i<str.length; i++)
		{
			if (Character.isAlphabetic(str[i]))
			{
				str[i] = (char)(str[i]^(1<<5));
			}
		}
	}
	public static void main(String[] args) 
	{
		String s="ApPLe";
		char [] str=s.toCharArray();
		toggleChars(str);
		System.out.println("String after toggle:"+"\n"+String.valueOf(str));

	}
}
