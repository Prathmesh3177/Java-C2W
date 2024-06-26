import java.io.*;
class Demo26{
	public static void main(String [] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter company name : ");
		String compName =  br.readLine();
		System.out.println("Ente employee Name : ");
		String empName =  br.readLine();
		System.out.println("Enter employee id : ");
		int empId =  Integer.parseInt(br.readLine());
		System.out.println("Enter employee Salary : ");
		double sal =  Double.parseDouble(br.readLine());
		System.out.println("Company Name : "+ compName);
		System.out.println("Employee Name : "+ empName);
		System.out.println("Employee Id : "+ empId);
		System.out.println("Employee Salary : "+ sal);

		
	}
}
