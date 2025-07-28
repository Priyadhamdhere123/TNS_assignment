import java.io.*;
class Range{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.print("Enter Number1 : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Enter Number2 : ");
		int num2 = Integer.parseInt(br.readLine());
		do{
			System.out.println(num1);
			num1++;
		}while(num1 <=num2);
	}
}

