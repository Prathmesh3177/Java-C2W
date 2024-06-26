import java.io.*;
class Demo34{
	public static void main(String [] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your name : ");
		String name = br.readLine(); 
		
		System.out.print("Enter your Soc name : ");
		String scName = br.readLine(); 
		
		System.out.print("Enter your flat no : ");
		int flatNo = Integer.parseInt(br.readLine()); 
		
		System.out.print("Enter your wing : ");
		char wing = (char)br.read(); 
		
	//	System.out.print("Enter your flat no : ");
	//	int flatNo = Integer.parseInt(br.readLine()); 
	
		System.out.println("Name : "+ name);		
		System.out.println("SocName : "+ scName);	
		System.out.println("Wing : "+ wing);	
		System.out.println("Flat Number : "+ flatNo);	
	 
	}
}
