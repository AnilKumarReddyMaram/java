import java.util.*;
class listmenu 
{
	public static void main(String[] args) 
	{
		List<Integer> list= new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("1. Append");
			System.out.println("2. Insert");
			System.out.println("3. Display");
			System.out.println("4. Replace");
			System.out.println("5. Delete");
			System.out.println("6. Search");
			System.out.println("7. Sort");
			System.out.println("8. Quit");
			System.out.println("Enter Choice :");
			int ch= sc.nextInt();
			if (ch==1)
			{
				System.out.println("Enter element :");
				int ele= sc.nextInt();
				list.add(ele);
				System.out.println("Appended");
			}
			else if (ch==2)
			{
				System.out.println("Enter index :");
				int loc=sc.nextInt();
				if (loc>=0 && loc<=list.size()-1)
				{
					System.out.println("Enter the element:");
					int ele= sc.nextInt();
					list.add(loc,ele);
					System.out.println("Inserted");
				}
				else
				{
					System.out.println("Error: Invalid loc");
				}
			}
			else if (ch==3)
			{
				System.out.println("List is :"+list);
			}
			else if (ch==4)
			{
				System.out.println("Enter index :");
				int loc = sc.nextInt();
				if (loc>=0 && loc<=list.size()-1)
				{
					System.out.println("Enter elemnt:");
					int ele=sc.nextInt();
					list.set(loc,ele);
					System.out.println("Replaced");
				}
				else
				{
					System.out.println("Error:Invalid loc");
				}
			}
			else if (ch==5)
			{
				System.out.println("Enter index:");
				int loc=sc.nextInt();
				if (loc>=0 && loc<=list.size()-1)
				{
					list.remove(loc);
					System.out.println("Removed");
				}
				else
				{
					System.out.println("No such location");
				}
			}
			else if (ch==6)
			{
				System.out.println("Enter the element:");
				int ele=sc.nextInt();
				int loc=Collections.binarySearch(list,ele);
				if (loc>=0)
				{
					System.out.println("Element found");
				}
				else
				{
					System.out.println("Not found");
				}
			}
			else if (ch==7)
			{
				Collections.sort(list);
				System.out.println("sorted");
			}
			else if (ch==8)
			{
				System.out.println("End");
				System.exit(1);
			}
			else
			{
				System.out.println("Invaliad Choice");
			}
		}
	}
}
