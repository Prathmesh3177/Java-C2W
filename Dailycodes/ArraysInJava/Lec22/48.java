import java.util.*;
class Demo48{
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		 String sc1=sc.nextLine();
		
		StringTokenizer str = new StringTokenizer(sc1,"");
	
		while(str.hasMoreTokens()){
			String str1 = str.nextToken();
			System.out.println(str1 +",");
		}
	}
}
