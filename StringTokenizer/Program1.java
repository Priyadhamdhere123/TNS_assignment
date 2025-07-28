import java.io.*;
class StringTokenizer{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		
		System.out.print("Enter Name : ");
		String name = br.readLine();
		
		System.out.print("Society name : ");
		String socName = br.readLine();
		
		//System.out.print("Enter Flat No : ");
                //int flatNo = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Wing : ");
		char wing = (char)br.read();
		br.skip(1);  // Ignore the first Character
		
		System.out.print("Enter Flat No : ");
		int flatNo = Integer.parseInt(br.readLine());
		
		System.out.println("Name : " + name);
		
		System.out.println("Society Name : " + socName);
		
		System.out.println("Wing : " + wing);
		
		System.out.println("Flat Number : " + flatNo);
	}
}

