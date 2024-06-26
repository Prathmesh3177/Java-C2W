import java.util.*;
class Demo11{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("Enter Collge Name : ");
		String clgName = sc.next();
		System.out.println("Enter studemt id ");
		int studId  = sc.nextInt();
		System.out.println("Enter CGPA : ");
		float marks =sc.nextFloat();
		
		System.out.println("Student name : "+name);
		System.out.println("Clg name : "+clgName);
		System.out.println("Id : "+studId);
		System.out.println("Marks : "+marks);
	}
}
