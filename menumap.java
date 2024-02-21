import java.util.*;
class menumap 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("1. Added");
			System.out.println("2. Display Map");
			System.out.println("3. Display value");
			System.out.println("4. Delete");
			System.out.println("5. End");
			System.out.print("Enter Your choice :");
			int key=sc.nextInt();
			if (key==1)
			{
				System.out.println("Enter key:");
				key=sc.nextInt();
				System.out.println("Enter value:");
				String value=sc.next();
				map.put(key,value);
				System.out.println("Added");
			}
			else if (key==2)
			{
				System.out.println("Map is :"+map);
			}
			else if (key==3)
			{
				System.out.print("Enter key to display value:");
				key =sc.nextInt();
				if (map.containsKey(key))
				{
					String val=map.get(key);
					System.out.println("Value is :"+val);
				}
				else 
				{
					System.out.println("No such key in Map");
				}
			}
			else if (key==4)
			{
				System.out.println("Enter key to remove");
				key = sc.nextInt();
				if (map.containsKey(key))
				{
					map.remove(key);
					System.out.println("Removed");
					System.out.println("Map is :"+map);
				}
				else
				{
					System.out.println ("No such key in map");
				}
			}
			else if (key==5)
			{
				break;
			}
			else
			{
				System.out.println("Please Enter Valid Choice");
			}
		}
	}
}
