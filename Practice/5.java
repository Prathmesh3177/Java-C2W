import java.util.*;
class Demo5{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("size :: ");
		int row =sc.nextInt();


		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i==j){
					System.out.print("*"+"\t");
				}else if((i+j)== (row+1)){
					System.out.print("*"+"\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
