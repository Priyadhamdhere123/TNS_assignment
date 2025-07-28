import java.io.*;
class Marks{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));
		System.out.print("Obtain marks in DSBDA : ");
		int DSBDA = Integer.parseInt(br.readLine());
		System.out.print("Obtain marks in WT : ");
		int WT = Integer.parseInt(br.readLine());
		System.out.print("Obatin marks in AI : ");
		int AI = Integer.parseInt(br.readLine());
		System.out.print("Obatin marks in IS : ");
		int IS = Integer.parseInt(br.readLine());
		int sum = 0;
		sum = DSBDA + WT + AI + IS;
		System.out.println(sum + " out of 400 ");
	}
}

