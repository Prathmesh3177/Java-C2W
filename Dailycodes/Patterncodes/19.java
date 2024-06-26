import java.util.*;
class Demo19{
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row =sc.nextInt();
		for(int i=1;i<=row;i++){
			int num1=1;
			int num2=2;
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(num1 + " " );
					num1=num1+2;
				}else{
					System.out.print(num2 + " ");
					num2 =2+num2;
				}
			}
			System.out.println();
		}
	}
}
