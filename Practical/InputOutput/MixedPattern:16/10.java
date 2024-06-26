import java.util.*;
class Demo10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		long num = sc.nextLong();
		
			
		long num1;
		long var=0;
		long num2;
		while(num>0){
			num1=num%10;
			var = var*10+num1;
			num/=10;
		}
		System.out.println("Reverse number is :: "+var);
		
		
		System.out.print("Squares are of odd numbers  :: ");
		long x,x2;
		while(var>0){
			x=var%10;
			if(x%2==1){
				x2 = x*x;
				System.out.print(x2 +",");
			}
			var/=10;
			
		}
		System.out.println();
	}
}
