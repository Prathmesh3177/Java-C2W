//take array of character from user find occurence of specific character

import java.util.*;
class Demo8{


	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		char arr[]=new char[size];

		System.out.println("Enter array element :");

		for(int i=0;i<size;i++){
		
		
			arr[i]=sc.next().charAt(0);
		
		}


		System.out.println("Enter element to be charcked :");
		char ele=sc.next().charAt(0);


	
                int count=0;
		for(int i=0;i<size;i++){
		
		
			if(arr[i]==ele){


				count++;
			
			
			}
		
		
		}





		System.out.println("Element occrence  "+count);
	
		
	
	}


}
