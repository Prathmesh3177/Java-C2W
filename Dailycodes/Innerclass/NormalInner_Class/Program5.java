 
 class Outer{
 
         int x=10;
	 Outer(){
	 
	 
	 	System.out.println("In outer Constructor");
	 
	 }

	 class Inner{
	 
	         int x=20;	
		 Inner(){
		 
		 
			System.out.println("In inner constructor"); 
			System.out.println(x); 
			System.out.println(Outer.this.x); 
		 
		 
		 }
	 
	 
	 }

 }

  class Client{
	 public static void main(String[]args){
	 
	 	
		 Outer obj=new Outer();
		 Outer.Inner obj1=obj.new Inner();
		 //Correct way to create an object if main class is written in seperate class 


	 
	   }


 }
