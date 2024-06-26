import java.util.*;
class Demo9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		
		int num;
		int num1=row;
		num=((row+1)*row)/2;
		for(int i=1;i<=row;i++){
			num=num1;
			for(int j=1;j<=row-i+1;j++){
				if(i%2==1){
					System.out.print(j+"\t");
				}else{
					System.out.print((char)(num+64)+"\t");
					num--;	
				}
			}
			num1--;
			System.out.println();
		}
	}
}
