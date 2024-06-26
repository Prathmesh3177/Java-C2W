//take array input from user and and find element occurs two times or more than two times

import java.util.*;
class Demo4{


	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];

		System.out.println("Enter array element :");

		for(int i=0;i<size;i++){
		
		
			arr[i]=sc.nextInt();
		
		
		}
                
                
	        int count=0;	
		System.out.println("Enter number to check");
                int num=sc.nextInt();


		for(int i=0;i<size;i++){
		
			if(arr[i]==num){
			
				count++;
			
			}
		
		
		}


		
	        if(count==2){
		
			System.out.println(num+"  occurs exactly two times");
		
		
		}

		else if(count>2){
		
	               	
			System.out.println(num+"  occurs more  two times");
		
		}
	
	
	}


}
