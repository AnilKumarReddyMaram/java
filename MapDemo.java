import java.util.*;
class MapDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(10,"Ten");
		map.put(20,"Twenty");
		map.put(30,"Thirty");
		map.put(40,"Forty");
		while (true)
		{
			System.out.println("Map is :"+map);
		
		System.out.println("Enter key to display Value:");
		int key=sc.nextInt();
		if (map.containsKey(key))
		{
			String val=map.get(key);
			System.out.println("Value is :"+val);
		}
		else
		{
			System.out.print("No such key in map");
		}
		System.out.println("Enter key to remove:");
		key=sc.nextInt();
		if (map.containsKey(key))
		{
			map.remove(key);
			System.out.println("removed");
			System.out.println("Map is:"+map);
		}
		else
		{
			System.out.println("No such key in map");
		}
		}
	}
}
