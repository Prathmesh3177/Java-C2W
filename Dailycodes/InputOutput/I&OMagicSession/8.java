import java.util.*; 
class Demo8{
	 public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int num1 =sc.nextInt();
		System.out.print("Enter the num2 : ");
		int num2 =sc.nextInt();
		int sum = 0;
		
		if(num1>=num2){
			for(int i=num2;i<=num1;i++){
				sum=sum+i;
			} 
		}else {
			for(int i=num1;i<=num2;i++){
				sum= sum+i;
			}
		}
		System.out.println("Sum is "+sum);
	}
}
