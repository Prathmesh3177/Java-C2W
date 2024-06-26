class Demo8{
	public static void main(String [] args){
		int x = 10;
		int y = 10;
	
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	//	System.out.println(System.identityHashCode(ch1));
		
		y=20;
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		
	}
}
