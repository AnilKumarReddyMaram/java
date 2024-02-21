class LargestNum 
{
	public static void main(String[] args) 
	{
		int x1=145;
		int x2=4;
		boolean f;
		for (int i=x1-1; i>=0; i--)
		{
			int num=i;
			f=true;
			while (num>0)
			{
				int r=num%10;
				if (r==x2)
				{
					f=false;
					break;
				}
				num=num/10;
			}
			if (f)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
