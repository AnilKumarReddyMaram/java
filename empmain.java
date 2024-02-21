import java.util.*;
class empmain{
	public static void main(String[] args) 
	{
		List<emp> list= new ArrayList<emp>();
		Scanner sc=new Scanner (System.in);
		while (true)
		{
			System.out.print("Enter Details :");
			int id = sc.nextInt();
			String name = sc.next();
			double salary=sc.nextDouble();
			emp e = new emp (id, name, salary);
			list.add (e);
			System.out.print("Do you want to add one one more (y/n) :");
			char ch = sc.next().charAt(0);
			if (ch=='n')
			{
				break;
			}
		}
		System.out.print("Details are:");
		for (emp x: list )
		{
			System.out.println(x.id+","+x.name+","+x.salary);
		}
	}
}
