import java.util.*;
class Reverse 
{
	public static void main(String[] args) 
	{
		String[] arr="This is core java test";
		for (int i=0; i<arr.length; i++)
		{
			String s=arr[i];
			for (int j=s.length()-1; j>=0; j--)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}
}
