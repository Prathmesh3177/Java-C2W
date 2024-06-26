 class Demo20{
	public static void main(String [] args){
		
		String str1 ="Shashi";
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		String str2 = new String ("Shashi");
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));
		
		String str3 = "Shashi";
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));

	}
}
