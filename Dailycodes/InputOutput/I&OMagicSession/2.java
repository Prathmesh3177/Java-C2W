import java.util.*; 
class Demo2{
	 public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age =sc.nextInt();

		if(age>=18){
			System.out.println("Eligible for voting");
		}else if(age>=0 &&  age<18){
			System.out.println("Not Eligible for voting");
		}else{
			System.out.println("Please enter valid age");
		}
		
	}
}
