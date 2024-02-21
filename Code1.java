class Code1 
{
	public static void main(String[] args) 
	{
		String a="ideyalabs";
		String b="eyalabsid";
		if (a.length()!=b.length())
		{
			System.out.println("Secound string is not a rotation of first string");
		}
		else
		{
			a=a.concat(a);
			if(a.indexOf(b)!=-1)
				System.out.println("Secound string is a rotation of first string");
			else
				System.out.println("Secound string is not a rotation of first string");
		}
	}
}
