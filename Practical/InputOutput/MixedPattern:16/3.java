import java.util.*;
class Demo3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		
		int num=0;	
		for(int i=1;i<=row;i++){
			num=row+64;
			for(int j=1;j<=row;j++){
				if(i%2==0){
					System.out.print(j +"\t");
				}else{
					System.out.print((char)num + "\t");
					num--;
				}
			}
			System.out.println();
		}
	}
}
