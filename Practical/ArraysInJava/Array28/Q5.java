
//take array of differnt size from elemnet and combine both arrays
import java.util.Scanner ;


class Demo5{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in) ;

		System.out.println("Enter Array1 Size :");
		int size1 = sc.nextInt();

		int arr1[] = new int[size1] ;
	        System.out.println("Enter Array 1  Element : ");
		for(int i = 0 ; i<size1 ; i++){

			arr1[i] = sc.nextInt() ;

	       }


		System.out.println("Enter Array 2 Size :");
		int size2 = sc.nextInt();

		int arr2[] = new int[size2] ;
		System.out.println("Enter Array 2  Element : ");

		for(int i = 0 ; i<size2 ; i++){

			arr2[i] = sc.nextInt() ;

		}	

               
		int combine = size1 + size2 ;
		int arr3[] = new int[combine];
           
                
		int i=0;
		for( i = 0 ; i<size1 ; i++){
		
			arr3[i] =arr1[i] ; 
		}

		for(int j = 0 ; j< size2 ; j++){
		
			arr3[i] = arr2[j] ; 
			i++ ;
		}


		for(int k = 0 ; k<combine ; k++){
		
			System.out.print(arr3[k]+" ");
		}
	    

	}
}
