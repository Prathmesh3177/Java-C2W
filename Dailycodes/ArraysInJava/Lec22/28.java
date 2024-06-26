import java.io.*;
class Demo28{
	public static void main(String [] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your name : ");
		String name = br.readLine(); 
		
		br.close();
		System.out.print("Enter your Soc name : ");
		String scName = br.readLine(); 
		
		System.out.print("Enter your wing : ");
		String wing = br.readLine(); 
		
		System.out.print("Enter your flat no : ");
		String flatNo = br.readLine(); 
		
	 
	}
}
