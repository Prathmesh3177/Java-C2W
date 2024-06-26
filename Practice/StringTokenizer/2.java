import java.util.StringTokenizer;
class Demo2 {
    public static void main(String[] args) {
        String sc = "Hello";
		
	for(int i=0;i<sc.length();i++){
		
/*		StringTokenizer str = new StringTokenizer(sc , "char[i]");		
		while(str.hasMoreTokens()){
		System.out.print(str.nextToken() +","); 
*/

		

		char c = sc.charAt(i);
		System.out.print(c + ",");
	}
	System.out.println();

  
    }
}

