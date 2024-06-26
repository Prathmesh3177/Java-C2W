//Check first dupilicate in array and return its index;
 import java.util.*;
 class Demo4{
 
 	public static void main(String[]args){
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element:");

		for(int i=0;i<size;i++){
		
			arr[i]=sc.nextInt();
		
		}

 
                int count=0;
		for(int i=0;i<size;i++){
		
			for(int j=i+1;j<size;j++){
			
				if(arr[i]==arr[j]){
				      

				      count=1;	
				      break;
				  
				}
			
			}


			if(count==1){
			
				System.out.println("first duplicate found at "+i);
			        break;  
			
			}
		
		
		}
	}
 
 
 }
