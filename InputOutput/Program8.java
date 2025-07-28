import java.io.*;
class InputOutput{
	public static void main(String [] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter Your Name : ");
		String name = br.readLine();
		System.out.println("Your name :" + name);
		br.close();
		System.out.print("Enter Company Name : ");
		String compName = br.readLine();
		System.out.println("Your Company Name :" + compName);
	}
}
