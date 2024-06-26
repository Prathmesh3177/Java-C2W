//take array of character from user if character is not lowercase replace it with the '#'symbol

import java.util.*;
class Demo9{


	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		char arr[]=new char[size];

		System.out.println("Enter array element :");

		for(int i=0;i<size;i++){
		
		
			arr[i]=sc.next().charAt(0);
		
		}


	
                
		for(int i=0;i<size;i++){
		
		
			if(97<=arr[i]&&arr[i]<=122){
			
				arr[i]=arr[i];
			
			
			}

			else{
			
				arr[i]='#';
			
			
			}
		
		
		}





		System.out.println("Final Array");


		for(int i=0;i<size;i++){
		
			System.out.println(arr[i]);
		
		
		}
	
		
	
	}


}
