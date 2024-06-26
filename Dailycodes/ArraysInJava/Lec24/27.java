import java.util.*;
class Demo27{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
	
		int arr[]=new int[size];
		System.out.println("Size of an Array : "+ arr.length);
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			System.out.println("Output : "+arr[i]);
		}
		
	}
}	
