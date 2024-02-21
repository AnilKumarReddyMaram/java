import java.util.*;
class Employee 
{
	private int id ;
	private String name;
	private double salary;
	private int deptNum;
	private String loc;
	public Employee() 
	{
		
	}	
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptNum=" + deptNum + ", loc=" + loc+ "]";
	}
	public Employee(int id, String name, double salary, int deptNum, String loc)
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptNum = deptNum;
		this.loc = loc;
	}
	public int getId()
	{
		return id;
	}
	public String getName() 
	{
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public int getDeptNum() {
		return deptNum;
	}
	public String getLoc() {
		return loc;
	}
}
class MenuDriven {
	public static void menuDriven() {
		Scanner sc = new Scanner(System.in);
		List<Employee> empList = new ArrayList<>();
		boolean flag = true;
		
		do {
			System.out.println("1.for adding emp details");
			System.out.println("2.for Searching emp details");
			System.out.println("3.for all emp details");
			System.out.println("4.for removing emp details");
			System.out.println("5.for Exit");
			System.out.print("Enter Number(1/2/3/4/5) : ");
			int n = sc.nextInt();
			switch (n) {
			case 1:{
				System.out.print("Enter emp Id : ");
				int id = sc.nextInt();
				
				System.out.print("Enter emp Name : ");
				String name = sc.next();
				
				System.out.print("Enter emp Salary : ");
				double salary = sc.nextDouble();
				
				System.out.print("Enter emp DeptNum : ");
				int deptNum = sc.nextInt();
				
				System.out.print("Enter emp Location : ");
				String loc = sc.next();
				empList.add(new Employee(id , name, salary,deptNum , loc ));
			}
				
				break;
			case 2:{
				System.out.print("Enter emp Id : ");
				int id = sc.nextInt();
				boolean f = false;
				for (Employee e : empList) {
					if(e.getId()==id) {
						System.out.println(e.toString());
						f= true;
					}
				}
				if(!f) {
					System.out.println("Invalid Id .....");
				}
//				empList.stream()
//				.filter(e -> e.getId()==id)
//				.forEach(e-> System.out.println(e.toString()));
			}
				
				break;
			
			case 3:{
				
				if(!empList.isEmpty())
				{
				System.out.println("All Employee Details ");
				empList.forEach(e-> System.out.println(e.toString()));
				}
				else
					System.out.println("List is Empty ");		
			}
				break;
				case 4:{
				System.out.print("Enter emp Id : ");
				int id = sc.nextInt();
				boolean f = false;
				for (int i = 0 ; i<empList.size();i++)
				{
					Employee e = empList.get(i);
					if(e.getId()==id) {
						empList.remove(i);
					}
				}
				if(!f)
				{
					System.out.println("Invalid Id .....");
				}				
//				empList.stream()
//				.filter(e -> e.getId()==id)
//				.forEach(e-> empList.remove(e));			
			}
				
				break;
			case 5:{
				System.out.println("Exited ......");
				flag = false;
			}
				break;	
			default:
				System.out.println("Enter Valid Input");
				break;
			}	
		}
		while(flag);
	}
}
class ListArray
{
	public static void main(String[] args) 
	{
		MenuDriven.menuDriven();
	}
}