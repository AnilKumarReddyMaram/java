import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class  myMap
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter size of array");
		int n=sc.nextInt();
		int[] id= new int[n];
		String[] name=new String[n];
		boolean flag=false;
		for(int i=0;i<id.length;i++){
			System.out.print("ENTER ID : "+i+" ");
			id[i]=sc.nextInt();
		}
		for(int i=0;i<name.length;i++){
			System.out.println("ENTER NAME : "+i+" ");
			name[i]=sc.next();
			
			}
			
		Map<Integer,String> map=new HashMap<Integer,String>();
		for(int i=0;i<id.length;i++){
			map.put(id[i],name[i]);
		}
		while(true){
			System.out.println();
			System.out.println();
			System.out.println("TO DISPLAY ALL ELEMENTS PRESS -> 1");
			System.out.println("TO DISPLAY SINGLE ELEMENTS PRESS -> 2");
			System.out.println("TO DELETE THE ELEMENT ELEMENTS PRESS -> 3");
			System.out.println("TO EXIT THE PROGRAM PRESS -> 4");
			System.out.println(" ENTER YOUR CHOICE FROM ABOVE MENU --> ");
			System.out.println();
			System.out.println();
			int ch=sc.nextInt();
			if(ch==1){
					System.out.println("MAP : ");
					System.out.println(map);
					flag=true;
					System.out.println();
					System.out.println();

			}else if(ch==2){
				System.out.print("ENTER KEY TO DISPLAY VALUE : ");
				 int key=sc.nextInt();
				flag=true;
				if(map.containsKey(key)){
						String val =map.get(key);
						System.out.println("VALUE : "+val);
						System.out.println();
						System.out.println();
				}else{
					System.out.println("NO SUCH KEY FOUND IN MAP");
					flag=true;
					System.out.println();
					System.out.println();
				}
			}else if(ch==3){
				//flag=true;
				System.out.print("ENTER KEY TO REMOVE ELEMENT");
				int key=sc.nextInt();
				if(map.containsKey(key)){
						map.remove(key);
						System.out.println(".....ELEMENT  REMOVED.....");
						System.out.println(" MAP : "+map);
						System.out.println();
						System.out.println();
				}else{
					System.out.println("NO SUCH KEY FOUND IN MAP");
					flag=true;
					System.out.println();
					System.out.println();
				}
			}else if(ch==4){
				System.out.println(" ........PROGRAM COMPLETED....... ");
				System.out.println();
				System.out.println();

			}
			else{
				System.out.println(" ----- PLEASE ENTER VALID CHOICE-----");
				System.out.println();
				System.out.println();
			}
		}
	}
}
