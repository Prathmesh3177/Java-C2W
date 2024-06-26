import java.util.*; 
class Demo5{
	 public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num =sc.nextInt();

		if(num%16==0){
			System.out.println(num +" is present in the table of 16");
		}else{
			System.out.println(num +" is not present in table of 16");
		}
		
	}
}
