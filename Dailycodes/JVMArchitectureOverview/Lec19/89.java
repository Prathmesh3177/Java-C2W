class Demo89{
	void methodfun(){
		System.out.println("In fun function");
	}
	void methodgun(){
		System.out.println("In gun function");
	}
	void methodrun(){
		System.out.println("In run Function");
	}
	public static void main (String [] args ){
		System.out.println("In Main Method");		
		Demo89 obj = new Demo89();
		obj.methodfun();
		obj.methodgun();
		obj.methodrun();
	}
}
