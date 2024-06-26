import java.util.*;
class Demo12{
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row =sc.nextInt();
		int num=1;
		for(int i=1;i<=row;i++){
			for(int j=row;j>=1;j--){
				if(i>=j){
					System.out.print(num++ +" ");
				}
			}
			System.out.println();
		}
	}
}
