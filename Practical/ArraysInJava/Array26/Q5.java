//take array input from user and find reverse of array

import java.util.*;
class Demo5{


	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];

		System.out.println("Enter array element :");

		for(int i=0;i<size;i++){
		
		
			arr[i]=sc.nextInt();
		
		}

                

	        int temp=0;	
		for(int i=0;i<size/2;i++){
		
			temp=arr[i];
			arr[i]=arr[size-1-i];
			arr[size-1-i]=temp;

		
		
		}


		
		System.out.println("Reversed array :");

		for(int i=0;i<size;i++){
		
			System.out.println(arr[i]);
		
		
		}
	
	
	}


}
