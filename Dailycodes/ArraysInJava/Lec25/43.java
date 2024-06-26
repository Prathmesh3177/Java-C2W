import java.util.*;
class Demo43{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of rows and columns :: ");
		int row =sc.nextInt();
		int column = sc.nextInt();

		int arr[][] = new int[row][column];

		System.out.println("Enter elemsnts of array :: ");

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
			
		System.out.println("Array Elements are :: ");
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j] + "\t" );
			}
			System.out.println();
		}
	}
}
