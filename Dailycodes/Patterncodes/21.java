import java.util.*;
class Demo21{
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row =sc.nextInt();
		int sum;
		for(int i=1;i<=row;i++){
			int num =i;
			sum=row;
			for(int j =1; j<=i;j++){
				System.out.print(num+" ");
				num=num+(sum-1);
				sum--;
				
			}
			System.out.println();
		}
	}
}
