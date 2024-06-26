

import java.util.Scanner ;


class Demo10 {

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in) ;

		System.out.println("Enter Array Size :");
		int size = sc.nextInt();

		char ary[] = new char[size] ;
		for(int i = 0 ; i<size ; i++){
			System.out.println("Enter Array Element : ");
			ary[i] = sc.next().charAt(0);

		}

		for(int i = 0 ; i<ary.length ; i++){

			System.out.println((int)ary[i]);
		}



	}
}
