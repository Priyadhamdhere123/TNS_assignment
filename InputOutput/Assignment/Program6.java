import java.io.*;
class RangeSum{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number1 : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Enter the Number2 : ");
		int num2 = Integer.parseInt(br.readLine());
		int sum = 0;
		do{
			sum=sum+num1;
			num1++;
		}while(num1<=num2);
		System.out.println(sum);
	}
}

