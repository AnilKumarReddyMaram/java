import java.util.*;
class mymaps 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array");
	    int n=sc.nextInt();
		System.out.println("Enter key:");
		int key=sc.nextInt(n);
		System.out.println("Enter value:");
		String value=sc.next();
		map.put(key,value);
		System.out.println("Added");
		while (true)
		{
			
			System.out.println("Map is :"+map);
			System.out.println("Enter key to display value:");
			key=sc.nextInt();
			if (map.containsKey(key))
			{
				String val=map.get(key);
				System.out.println("value is:"+val);
			}
			else
			{
				System.out.println("No such key in map");
			}
			System.out.println("Enter key to remove :");
			key=sc.nextInt();
			if (map.containsKey(key))
			{
				map.remove(key);
				System.out.println("Removed");
				System.out.println("Map is:"+map);
			}
			else
			{
				System.out.println("No such key in map");
			}
		}

	}
}
