import java.util.*;
class Demo4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		
	/*	int num;
		int num1;
		 num= row;
		for(int i=1;i<=row;i++){
			
			num1=num;
			for(int j=1;j<=i;j++){
				System.out.print(num1 +"\t");
				num1+=num;
			}
			num--;
			System.out.println();
		}  */

	

		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=row;j>=num;j--){
				System.out.print(i*j +"\t");
				num--;
			}
			
			System.out.println();
		}
	}
}
		

