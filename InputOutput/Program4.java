import java.util.*;
class InputOutput{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name : ");
		String name = sc.next();
		System.out.print("Enter the clgName : ");
		String clgName = sc.next();
		System.out.print("Enter the Student id : ");
		int id = sc.nextInt();
		System.out.print("Enter the CGPA : ");
		float Cgpa = sc.nextFloat();
		System.out.println("Name :"+ name);
		System.out.println("clgName :" + clgName);
		System.out.println("Student id :" + id);
		System.out.println("CGPA :" +Cgpa);
	}
}
		
