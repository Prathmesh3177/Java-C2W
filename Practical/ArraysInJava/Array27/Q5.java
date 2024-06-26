//Check count of digits in elements of an array;
 import java.util.*;
 class Demo5{
 
 	public static void main(String[]args){
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element:");

		for(int i=0;i<size;i++){
		
			arr[i]=sc.nextInt();
		
		}

 
                int num=0;

		for(int i=0;i<size;i++){
		     int digit=0;
                     while(arr[i]>0){
		     
		     		arr[i]=arr[i]/10;
				digit++;
		     
		     }

		     System.out.println("Number of digits "+digit);
		
		
		}
	}
 
 
 }
