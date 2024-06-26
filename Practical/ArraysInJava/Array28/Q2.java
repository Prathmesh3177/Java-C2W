//find sum of all prime numbers and also count number of prime number

import java.util.Scanner ;


class Demo2{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in) ;

		System.out.println("Enter Array Size :");
		int size = sc.nextInt();

		int arr[] = new int[size] ;
	        System.out.println("Enter Array Element : ");
		for(int i = 0 ; i<size ; i++){

			arr[i] = sc.nextInt() ;

	       }

	      
	       int totalcount  = 0 ;
	       int sum = 0; 

	       for(int i = 0 ; i<arr.length ; i++){

	               int count=0;
		       for(int j = 1 ; j<= arr[i] ; j++){

			       if((arr[i]%j)==0){
			       
			            
                                      count++;
			       
			       }
			 
	        }

		
                        if(count==2){
			
				totalcount++;
				sum=sum+arr[i];
			
			}

       	       }
	       System.out.println("sum of prime number in Array is :"+sum);
	       System.out.println("total prime number are :"+ totalcount);


	}
}
