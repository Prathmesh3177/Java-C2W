//take array of vowels and consonen from user and count the vowels and consonant

import java.util.*;
class Demo6{


	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		char arr[]=new char[size];

		System.out.println("Enter array element :");

		for(int i=0;i<size;i++){
		
		
			arr[i]=sc.next().charAt(0);
		
		}


	
                int vocount=0;
		int cocount=0;
		for(int i=0;i<size;i++){
		
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
				vocount++;
			
			}


			else{
			
			
				cocount++;
			
			
			}
		
		
		}





		System.out.println("Vowels count: " +vocount);
	
		System.out.println("Consonant count:  "+cocount);
	
	}


}
