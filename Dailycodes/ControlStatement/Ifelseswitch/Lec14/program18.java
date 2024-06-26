 class Demo18 {
	public static void  main (String args []){
		char data = 'B';
	
		System.out.println("Before Switch");
	
		switch(data){
			case 'A' :
				System.out.println("A");
				break;

			case 65 :
				System.out.println("65");
				break;
			
			case 'B':
				System.out.println("B");
				break;
			
			case 66 :
				System.out.println("66");
				break;
			
			case 'C':
				System.out.println("C");
				break;
			
			case 67 :
				System.out.println("67");
				break;
			
			default :
				System.out.println("In default state");
			
		}
		System.out.println("After switch");
	}
}
