//Check whether givrn array is palindrom or not
 import java.util.*;
 class Demo3{
 
 	public static void main(String[]args){
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element:");

		for(int i=0;i<size;i++){
		
			arr[i]=sc.nextInt();
		
		}


                int flag=0;
		for(int i=0;i<size/2;i++){
		
			
			if(arr[i]==arr[size-1-i]){
			
				flag=0;
			
			}


			else{
			
				flag=1;
				break;
			
			}
               }

		       if(flag==0){
		       
		       		System.out.println("Array is palindrome");
		       
		       }

		       else{
		       
		       		
		       		System.out.println("Array is not  palindrome");
		       
		       }

		
		
	
	
	}
 
 
 }
