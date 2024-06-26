import java.util.*;
class Demo41{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int arrSize = sc.nextInt();
		
		int arr[] =new int [arrSize];
		
		System.out.println("Enter elements :: ");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length ;i++){
			System.out.println(arr[i]);
		}
	}
}
