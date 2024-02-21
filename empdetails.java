import java.util.*;
class emp
{
	int id;
	String name;
	double salary;
	String location;
	emp (int id, String name, double salary, String location)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.location=location;
	}
}
class empdetails 
{
	public static void main(String[] args) 
	{
		int [] ids={101,102,103,104,105};
		String [] names={"anil","harsha","yogi","salman","koushik"};
		double [] salaries={100000.00,40000.00,60000.00,55000.00,30000.00};
		String [] locations={"hyd","chennai","pune","bangalore","hyd"};
		List<emp> list= new ArrayList<>();
		for (int i=0;i<ids.length;i++)
		{
			emp e=new emp(ids[i],names[i],salaries[i],locations[i]); 
			list.add(e);
		}
		System.out.println("records are:");
		for (emp x:list)
		{ 
			System.out.println(x.id+","+x.name+","+x.salary+","+x.location);
		}
		System.out.println("display details of id=103");
		for (int i=0; i<ids.length ;i++ )
		{
			if (ids[i]==103)
			{
				emp x=list.get(i);
				System.out.println(x.id+","+x.name+","+x.salary+","+x.location);
			}
		}
		System.out.println("display details of locations in hyd");
		for (int i=0; i<ids.length ;i++ )
		{
			if (locations[i].equals("hyd"))
			{
				emp x=list.get(i);
				System.out.println(x.id+","+x.name+","+x.salary+","+x.location);
			}
		}
		System.out.println("display the details not belongs to hyd and pune");
		for (int i=0; i<ids.length; i++)
		{
			if (locations[i]!=("hyd") && locations[i]!=("pune"))
			{
				emp x=list.get(i);
				System.out.println(x.id+","+x.name+","+x.salary+","+x.location);
			}
		}
		System.out.println("display details of id=104");
		for (int i=0; i<ids.length ;i++ )   
		{
			if (ids[i]==104)
			{
				emp x=list.get(i);
				System.out.println(x.id+","+x.name);
			}
		}
		System.out.println("display details in reverse order");
		for (int i=ids.length-1; i>=0; i-- )
		{
			emp x=list.get(i);
			System.out.println(x.id+","+x.name+","+x.salary+","+x.location);
		}
		System.out.println("display details where salary between 30000 to 40000");
		for (int i=0; i<ids.length; i++)
		{
			if ((salaries[i]>=30000) && (salaries[i]<=40000))
			{
				emp x=list.get(i);
				System.out.println(x.id+","+x.name+","+x.salary+","+x.location);
			} 
		}
		System.out.println("check harsha present in list or not");
		boolean flag=false;  
		for (int i=0; i<ids.length; i++)
		{
			if (names[i].equals("harsha")) 
			{
				flag=true;
			}
		}
		if (flag)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("Not found");
		}
	}
}
 