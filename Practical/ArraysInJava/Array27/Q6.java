//Check first prime number in array
 import java.util.*;
 class Demo6{
 
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
		
			int count=0;
                        int j=1;

			while(j<=arr[i]){
			
			       if(arr[i]%j==0){
			       
				       count++;
			       
			       }
			    
			     j++;  
			}

	                
	                if(count==2){
			
			
				System.out.println("first prime number is at index "+i);
				break;
			
			}		

		
		
		}


	}
 
 
 }
