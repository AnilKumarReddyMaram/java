class pelidrom 
{
	public static void main(String[] args) 
	{
		String str="madam arora teacher malayalam";
		String rev="";
		for (int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
			if (str.equals(rev))
			{
				System.out.println("It is Pelidrom");
			}
			else
			{
				System.out.println("not");
			}
		}
	}
}
