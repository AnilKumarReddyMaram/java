import java.util.*;
class SpecifiedNum 
{
	public static void main(String[] args) 
	{
		int [] n= new int [] {1,1,2,1,3,1,5,3,2,6,2};
		System.out.println("Array:"+Arrays.toString(n));
		List<Integer> SpecifiedNum= new ArrayList<Integer>();
		List<Integer> frequency= new ArrayList<Integer>();
		int frequencyLoop=0;
		for (int i=0; i<n.length; i++)
		{
			int value = n[i];
			if (!(SpecifiedNum.contains(value)))
			{
				SpecifiedNum.add(value);
				frequencyLoop=1;
				for (int j=i+1; j<n.length; j++)
				{
					if (n[j]==value)
					{
						frequencyLoop=frequencyLoop+1;
					}
				}
				frequency.add(frequencyLoop);
			}
		}
		for (int i=0; i<SpecifiedNum.size(); i++)
		{ 
			System.out.println(SpecifiedNum.get(i)+"-"+frequency.get(i)+"times");
		}
	}
} 