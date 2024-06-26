import java.util.*;
class Demo1{
	public static void main(String [] args){
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the any number : ");
		a=sc.nextInt();
		
		if(a%2==1){
			System.out.println("Number is odd");
		}else if(a==0){
			System.out.println("Number is zero");
		}else {
			System.out.println("Number is even");
		}
	}
}
