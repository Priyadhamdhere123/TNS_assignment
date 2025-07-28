import java.io.*;
class Divisible{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		System.out.print("Enter Number : ");
		int num = Integer.parseInt(br.readLine());
		if(num % 8 == 0){
			System.out.println(num + " is divisible by 8");
		}else{
			System.out.println(num + " is not divisible by 8");
		}
	}
}
