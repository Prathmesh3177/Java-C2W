//take array of character from user and print all character before user key means array is a b c d e user gives key =e then print only a b c d

import java.util.*;
class Demo10{


	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		char arr[]=new char[size];

		System.out.println("Enter array element :");

		for(int i=0;i<size;i++){
		
		
			arr[i]=sc.next().charAt(0);
		
		
		}


		System.out.println("Enter character key :");
		char ele=sc.next().charAt(0);




	
                
		for(int i=0;i<size;i++){
		
		
			if(arr[i]!=ele){
			
				System.out.println(arr[i]);
			
			
			}

			else{
			
				break;
			
			
			}
		
		
		}





		
	
		
	
	}


}
