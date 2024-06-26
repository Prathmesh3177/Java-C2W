import java.util.*; 
class Demo3{
	 public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num =sc.nextInt();

		if(num%8==0){
			System.out.println("Divisible by 8");
		}else{
			System.out.println("Not divible by 8");
		}
		
	}
}
