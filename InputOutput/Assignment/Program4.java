import java.io.*;
class Table{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.print("Enter the Number :");
		int num = Integer.parseInt(br.readLine());
		for(int i = 1; i<= 10 ; i++){
			System.out.println(num*i);
		}
	}
}
