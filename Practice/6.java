import java.util.*;
class Demo6{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("size :: ");
		int row =sc.nextInt();


		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i==1 || j==1 ||  i==row || j== row)
					System.out.print("*"+"\t");
				else
					System.out.print("\t");
				
			}
			System.out.println("\t");
		}
	}
}
