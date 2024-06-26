import java.util.*;
class Demo28{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
	
		int arr[]=new int[size];
			
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter elements : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are : ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
}	
