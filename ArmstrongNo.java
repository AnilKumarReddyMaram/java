import java.util.*;
class ArmstrongNo 
{
	public static void main(String[] args) 
	{
		int r;
		int sum=0;
		int c=0;
		int s;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number:");
		int n =sc.nextInt();
		int temp=n;
		while (temp>0)
		{
			temp=temp/10;
			c++;
		}
			while (temp>0)
			{
				r=temp%10;
				s=1;
				for (int i=0; i<=c; i++)
				{
					s=s*r;
				}
				sum=sum+s;
				temp=temp/10;
			}
			if (temp==sum)
			{
				System.out.println("ArmStrong");
			}
			else
		    {
				System.out.println("Not ArmStrong");
		    }
	}
}
