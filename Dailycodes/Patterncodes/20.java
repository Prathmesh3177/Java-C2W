import java.util.*;
class Demo20{
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row =sc.nextInt();
		int num =0;
		int sum=0;
		for(int i=1;i<=row;i++){
			num=num+i;
			sum=num;
			for(int j =1; j<=i;j++){
				System.out.print(sum--+" ");
			}
			System.out.println();
		}
	}
}
