//take the array input from user and display each elemnt by adding one to element 
 import java.util.*;
 class Demo9{
 
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
		
			
			arr[i]=arr[i]+1;
			System.out.print(arr[i]+",");

               }


	      


	       

	                

		
		
	
	
	}
 
 
 }
