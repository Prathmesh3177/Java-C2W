import java.util.*;
class Demo37{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		String name = sc.next();	
		
		System.out.print("Enter SocName : ");
		String scName = sc.next();	
		
		System.out.print("Enter wing : ");
		char wing = sc.next().charAt(0);	
		
		System.out.print("Enter flatNO : ");
		int flatNo = sc.nextInt();
		
		System.out.println("Name : "+ name);	
		System.out.println("socName : "+ scName);	
		System.out.println("wing : "+ wing);	
		System.out.println("flat NO. : "+ flatNo);	
	}
}
