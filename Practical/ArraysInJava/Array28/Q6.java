
//take array input from user and check whether multiple of specific number taken from number present in the array
import java.util.Scanner ;


class Demo6{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in) ;

		System.out.println("Enter Array Size :");
		int size = sc.nextInt();

		int arr[] = new int[size] ;
	        System.out.println("Enter Array Element : ");
		for(int i = 0 ; i<size ; i++){
			
			arr[i] = sc.nextInt();


		}

		System.out.println("Enter the key:");
		int key=sc.nextInt();

		for(int i = 0 ; i<arr.length ; i++){
		
			if((arr[i]%key)==0){


			        System.out.println("multiple is found at index:"+i);

			}
		}

	



	}
}
