 

class Outer {


	int x=10;
	void Fun(){
	

		System.out.println("Im fun Outer");
	
	}

	class Inner{
	
		
		
	
	}

	void run(){
	
		
		System.out.println("In run outer");
	
	}



	public static void main(String[]atgs){
	
	
		Outer obj=new Outer();
		Inner in=obj.new Inner();

	
	
	}

}

