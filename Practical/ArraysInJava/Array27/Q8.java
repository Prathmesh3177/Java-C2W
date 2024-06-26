//find second minimum number in an array
 import java.util.*;
 class Demo8{
 
 	public static void main(String[]args){
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element:");

		for(int i=0;i<size;i++){
		
			arr[i]=sc.nextInt();
		
		}


                int min=Integer.MAX_VALUE;
                int min2=Integer.MAX_VALUE;
		for(int i=0;i<size;i++){
		
			
			if(arr[i]<min){
			
				min=arr[i];
			
			}

               }


	       for(int j=0;j<size;j++){
	       
	       
		       if (arr[j]<min2&&arr[j]>min){
		       
		       		min2=arr[j];
		       
		       }
	       
	       
	       }


	       System.out.println("Second minimum element in an array is "+min2);

	                

		
		
	
	
	}
 
 
 }
