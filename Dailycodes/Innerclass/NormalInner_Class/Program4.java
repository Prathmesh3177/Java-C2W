 
 class Outer{
 
         int x=10;
	 Outer(){
	 
	 
	 	System.out.println("In outer Constructor");
	 
	 }

	 class Inner{
	 
	 	
		 Inner(){
		 
		 
			System.out.println("In inner constructor"); 
			System.out.println(x); 
		 
		 
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
