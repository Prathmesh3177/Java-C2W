import java.util.*;
class Demo8{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		
		int num;
		num=((row+1)*row)/2;
		for(int i=1;i<=row;i++){
			for(int j=row;j>=i;j--){
				System.out.print((char)(num+64) +"\t");
				num--;
			}
			
			System.out.println();
		}
	}
}
