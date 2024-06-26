import java.util.*;
class Demo22{
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row =sc.nextInt();
		int num =1;
		for(int i=row;i>=1;i--){
			for(int j=1; j<=row;j++){
				if(i<=j){
					System.out.print(num++ +" ");
				}else{
					System.out.print(" " +" ");						}
			}System.out.println();
		}
	}
}
