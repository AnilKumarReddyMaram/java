import java.util.*;
class Duplicates 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,5,5,8,9,2,5,7,1,10,1,2};
		System.out.println("Array:"+Arrays.toString(arr));
		for (int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[i]!=0 && (arr[i]==arr[j]))
				{
					System.out.println(arr[i]+"is duplicated");
					arr[j]=0;
					break;
				}
			}
		}
	}
}
