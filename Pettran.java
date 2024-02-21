class Pettran 
{
	public static void main(String[] args) 
	{
		for (int i=0; i<=10; i++)
		{
			for (int j=0; j<=10; j++)
			{
				if ((j==10)||(j==8 &&(i>=2 && i<=9))||(j==6 && (i>=3 && i<=8))||(j==4 && (i>=4 && i<7))||(j==2 && i==5)) 
				{
					System.out.print(j);
				}
				else
				{
					System.out.println(" ");
				}
			}
			System.out.println();
		}
	}
}
