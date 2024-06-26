//take array input from user and find differnce between maximum and minimum numbers

import java.util.*;
class Demo2{


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


		
		int min=arr[0];

		for(int i=0;i<size;i++){
		
			if(min>arr[i]){
			
				min=arr[i];
			
			}
		
		}



		int dif=max-min;

		System.out.println("Differnce is  "+dif);
	
	
	}


}
