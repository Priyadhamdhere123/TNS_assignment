import java.util.*;
class ScannerStringTokenizser{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		String name = sc.next();
		
		System.out.print("Enter Society Name : ");
		String socName = sc.next();
		
		System.out.print("Enter Wing : ");
		char wing =sc.next().charAt(0);

		System.out.print("Enter Flat No : ");
		int flatNo = sc.nextInt();

		System.out.println("Name : " + name);
		System.out.println("Society Name : " + socName);
		System.out.println("Wing : " + wing);
		System.out.println("Flat No : " + flatNo);
	}
}
