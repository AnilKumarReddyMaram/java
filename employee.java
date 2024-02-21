import java.util.*;
class Emp
{
	private int id;
	private String name;
	private double salary;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return this.salary;
	}
}
class MyEmp 
{
	public static void main(String[] args) 
	{
		Map<Integer,Emp> map=new HashMap<Integer,Emp>();
		Scanner sc=new Scanner(System.in);
		while (true)
		{
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter name:");
			String name=sc.next();
			System.out.println("Enter salary:");
			double salary=sc.nextDouble();
			Emp e= new Emp();
			e.setInt(id);
			e.setString(name);
			e.setDouble(salary);
			map.put(id,e);
			System.out.println("Do You want to emp (y/n):");
			char ch=sc.next().charAt(0);
			if (ch=='n')
			{
				break;
			}
		}
		System.out.println("Enter id to display details:");
		int id=sc.nextInt();
		if (map.containsKey(id))
		{
			Emp e=map.get(id);
			System.out.println(e.getId()+","+e.getName()+","+e.getSalary());
		}
	else
		{
		System.out.println("no such employee");
		}
	}

}
