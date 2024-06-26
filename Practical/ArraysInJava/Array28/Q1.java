//check whether array is in descending order or not
import java.util.Scanner ;


class Demo1{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in) ;

		System.out.println("Enter Array Size :");
		int size = sc.nextInt();

		int arr[] = new int[size] ;
	        System.out.println("Enter Array Element : ");
		for(int i = 0 ; i<size ; i++){
		
			arr[i]=sc.nextInt();
		
		}

                
		int flag=0;
		for(int i=0;i<size-1;i++){
		
		
			if(arr[i]>arr[i+1]){
			
				flag=0;
			
			}

			else{
			
			
				flag=1;
				break;
			
			}
		
		}



		if(flag==0){
		
			System.out.println("Array is in descending oreder");
		
		
		}


		else{
		
			System.out.println("Array is not in ascending order");
		
		
		}
               
       }

}     

















	                                                                                                                                                              













































































