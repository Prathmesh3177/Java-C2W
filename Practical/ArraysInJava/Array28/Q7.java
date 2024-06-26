
import java.util.Scanner ;


class Demo7{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in) ;

		System.out.println("Enter Array Size :");
		int size1 = sc.nextInt();

		int ary1[] = new int[size1] ;
		for(int i = 0 ; i<size1 ; i++){

			System.out.println("Enter Array 1  Element : ");
			ary1[i] = sc.nextInt() ;

	       }

	          
	       int ary2[] = new int[size1] ;


	       for(int i = 0 ; i< size1 ; i++){
	       
		       ary2[i] = ary1[size1-1-i] ;
	       }


		       System.out.print("Array after reverse :");
	       
		       for(int i = 0 ; i< size1 ; i++){
	         	       System.out.print(ary2[i]+" ");
		       }


		       System.out.println();

	       for(int i = 0 ; i< size1 ;  i+=2){
	       
		       System.out.print(ary1[i]+" ");
	       }

	       System.out.println();


	       for(int i = 0 ; i< size1 ;  i+=2){
	       
		       System.out.print(ary2[i]+" " );
	       }
		
	}
}
