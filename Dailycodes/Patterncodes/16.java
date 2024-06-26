import java.util.*;
class Demo16{
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row =sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j +" " );
			}
			for(int k=i;k>1;k--){
				System.out.print(k-1 +" ");
			}
			System.out.println();
		}
	}
}
