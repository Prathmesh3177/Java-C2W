import java.util.*;
class Demo30{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);

		System.out.print("Enter name : ");
		String name = sc.next();
		
		System.out.print("Enter socname : ");
		String scName = sc.next();
		
		System.out.print("Enter wing name : ");
		char wing = sc.next().charAt(0);
		
		System.out.print("Enter flatNo : ");
		int  flatNo = sc.nextInt();
		

		System.out.println("NAME : "+name);
		System.out.println("Society Name : "+scName);
		System.out.println("Wing  : "+wing);
		System.out.println("FlatNumber : "+flatNo);
	}
}
