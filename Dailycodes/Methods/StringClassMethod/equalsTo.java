// checked string with same character sequenced and return true if only both are symetrically equal 
//
 class EqualsStringDemo{
 
 	public static void main(String[]args){
	
		String str1="Rahul";
		String str2=new String("Rahul");

		System.out.println(str1.equals(str2));//true
						  
		String str3="Parth";
		String str4="Parth";
		System.out.println(str3.equals(str4));//true  chequed sequenced
		System.out.println(str3==str4);//true here it checks is address is
					       //same or not now both string are 
					       //at scp
                
	        String str5="Amar";
	        String str6=new String("Amar");
	        System.out.println(str5==str6);//false because address are differnt                                                 one string at scp and other is 
					       //at heap area	

	
	}
     
 
 }
