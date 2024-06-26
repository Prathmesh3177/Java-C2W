//Print sum of odd and even numbers in array
 import java.util.*;
 class Demo2{
 
 	public static void main(String[]args){
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element:");

		for(int i=0;i<size;i++){
		
			arr[i]=sc.nextInt();
		
		}

                int evensum=0;
		int oddsum=0;
		for(int i=0;i<size;i++){
		
			
			if(arr[i]%2==0){
			
				evensum=evensum+arr[i];
			
			}


			else{
			
				oddsum=oddsum+arr[i];
			
			}
               }

			System.out.println("Even sum: "+evensum);
			System.out.println("odd  sum: "+oddsum);

		
		
	
	
	}
 
 
 }
