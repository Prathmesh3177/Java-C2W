import java.util.*; 
class Demo10{
	 public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks of math : ");
		int math =sc.nextInt();
		System.out.print("Enter the marks of english : ");
		int english =sc.nextInt();
		System.out.print("Enter the marks of science  : ");
		int science =sc.nextInt();
		System.out.print("Enter the marks of marathi : ");
		int marathi =sc.nextInt();
		int totalmarks =0;
		
		if(math>=0 && math<=100 && science>=0 && science<=100 && english>=0 && english<=100 && marathi>=0 &&marathi<=100){
 			totalmarks = math+science + english + marathi;		
			System.out.println(totalmarks + " out of 400" );
		}else {
			System.out.println("Please enter marks between 0 and 100");
		}
	}
}
