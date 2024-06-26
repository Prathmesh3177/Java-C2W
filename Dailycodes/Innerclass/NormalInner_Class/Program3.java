 
 class Outer{
 
 
	 Outer(){
	 
	 
	 	System.out.println("In outer Constructor");
	 
	 }

	 class Inner{
	 
	 	
		 Inner(){
		 
		 
			System.out.println("In inner constructor"); 
		 
		 
		 }
	 
	 
	 }


	 public static void main(String[]args){
	 
	 	
		 Outer obj=new Outer();
		 Inner obj1=obj.new Inner();


	 
	 
	 }


 
 
 
 
 }
