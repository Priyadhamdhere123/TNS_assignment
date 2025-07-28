import java.io.*;
class EvenOdd{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.print("Enter the Number : ");
		int num = Integer.parseInt(br.readLine());
		if(num % 2 == 0){
			System.out.println(num + " is Even");
		}else {
			System.out.println(num + " is Odd");
		}
	}
}

