//if count of input  given by user in array is greater than 2 replace that number by its cube

import java.util.Scanner ;


class Demo3{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in) ;

		System.out.println("Enter Array Size :");
		int size = sc.nextInt();

		int arr[] = new int[size] ;
		System.out.println("Enter array element:");
		for(int i = 0 ; i<size ; i++){

			
			arr[i] = sc.nextInt() ;

              	       }

                System.out.println("Enter key");
		int key=sc.nextInt();



		for(int i = 0 ; i<size ;i++){
		         int count = 0 ;
		
			for(int j = 0 ;j<size ; j++){
			
				if(arr[i]==key){
				
					count++ ;
				}
			}
			if(count>2){

				int temp = arr[i];
			
				for(int k = 0 ; k<size ;k++){
				
					if(arr[k]==temp){
					
						arr[k]= arr[k]*arr[k]*arr[k] ;
					}
				}
			}
		}

		for(int i = 0 ; i<size ; i++){
		
			System.out.println(arr[i]+" ");
		}

	      
	      


	}
}
