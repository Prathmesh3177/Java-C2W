import java.util.*;
class Demo6{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		
		int num;
		for(int i=1;i<=row;i++){
			num=row;
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print(num-- +"\t");
				}else{
					System.out.print((char)(num+96) + "\t");
					num--;
				}
			}
			System.out.println();
		}
	}
}
