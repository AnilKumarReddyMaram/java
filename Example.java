import java.util.*;
class Example 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String res="";
		System.out.println("Enter Your number");
		String[] strarr={"Zero","One","Two","Three","Four","Five","Six","Sevsn","Eight","Nine"};
		String s=sc.next();
		for (int i=0; i<s.length(); i++)
		{
			char ch =s.charAt(i);
			if (ch >= 48 && ch<=57)
			{
				int d=ch-48;
				res +=strarr[d]+"";
			}
		}
		System.out.println(res);
	}
}
