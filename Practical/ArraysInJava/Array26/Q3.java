//take array input from user and find second largest element in array

import java.util.*;
class Demo3{


	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];

		System.out.println("Enter array element :");

		for(int i=0;i<size;i++){
		
		
			arr[i]=sc.nextInt();
		
		}


		int max=arr[0];

		for(int i=0;i<size;i++){
		
			if(max<arr[i]){
			
				max=arr[i];
			
			}
		
		
		}


		
		int max2=arr[0];

		for(int i=0;i<size;i++){
		
			if(arr[i]>=max2&&arr[i]<max){
			
				max2=arr[i];
			
			}
		
		}



		

		System.out.println("Second largest element in array is   "+max2);
	
	
	}


}
