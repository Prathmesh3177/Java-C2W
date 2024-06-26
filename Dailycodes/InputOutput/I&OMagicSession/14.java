import java.util.*;
class Demo14{
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row = sc.nextInt();
		int num =65;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print((char)num +" " );
				num+=2;
			}
			System.out.println();
		}
	}
}
