//take the array input from user and display facrorial of each element 
 import java.util.*;
 class Demo10{
 
 	public static void main(String[]args){
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element:");

		for(int i=0;i<size;i++){
		
			arr[i]=sc.nextInt();
		
		}


              
		for(int i=0;i<size;i++){
		        
			int fact=1;
			int j=arr[i];
		        while(j>1){
			
				fact=fact*j;
			
		          j--;		
			
			}

			System.out.print(fact+",");

               }


	      


	       

	                

		
		
	
	
	}
 
 
 }
