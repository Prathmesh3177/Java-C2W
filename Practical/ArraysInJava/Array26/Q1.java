//take array input from user and find average of array element and display it

import java.util.*;
class Demo1{


	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];

		System.out.println("Enter array element :");

		for(int i=0;i<size;i++){
		
		
			arr[i]=sc.nextInt();
		
		}


		int sum=0;

		for(int i=0;i<size;i++){
		
			sum=sum+arr[i];
		
		
		}

		int avg=sum/size;


		System.out.println("Average of an array is  "+avg);
	
	
	}


}
