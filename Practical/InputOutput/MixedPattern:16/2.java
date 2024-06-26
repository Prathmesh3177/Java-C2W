import java.util.*;
class Demo2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		
		int num1=0;
		int num=row;
		for(int i=1;i<=row;i++){
			num1=num+i-1;
			for(int j=1;j<=row;j++){
				System.out.print(""+(char)(num+64) +num1-- +"\t ");
			}
			System.out.println();
		}
	}
}
