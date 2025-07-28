import java.io.*;
class InputOutput{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.print("Enter the Name : ");
		String name = br.readLine();
		
		System.out.print("Enter Company name : ");
		String cmpName = br .readLine();
		
		System.out.print("Employee id : ");
		int empId = Integer.parseInt(br.readLine());

		System.out.println("Your Name : " + name);
		System.out.println("Your Company : " + cmpName);
		System.out.println("Your empId : " + empId);
	}
}
		


