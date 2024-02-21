import java.util.*;
class Emp 
{
	int id;
	String name;
	double salary;
	Emp(int id, String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		}
}
class main{
	public static void main(String[] args) 
	{
		List<Emp> list= new ArrayList<Emp>();
		Scanner sc=new Scanner (System.in);
		while (true)
		{
			System.out.print("Enter Details :");
			int id = sc.nextInt();
			String name = sc.next();
			double salary=sc.nextDouble();
			Emp e = new Emp (id, name, salary);
			list.add (e);
			System.out.print("Do you want to add one one more (y/n) :");
			char ch = sc.next().charAt(0);
			if (ch=='n')
			{
				break;
			}
		}
		System.out.print("Details are:");
		for (Emp x: list )
		{
			System.out.println(x.id+","+x.name+","+x.salary);
		}
	}
}