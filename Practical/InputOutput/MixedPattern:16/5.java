import java.util.*;
class Demo5{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		
		
		int num1;
		int num;
		for(int i=1;i<=row;i++){
			num=i;
			num1=num;
			for(int j=1;j<=i;j++){
				System.out.print(num1 +"\t");
				num1+=num;
			}
			
			System.out.println();
		}
	}
}
