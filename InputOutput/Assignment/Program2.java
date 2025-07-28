import java.util.*;
class Voter{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age : ");
		int age = sc.nextInt();
		if(age >= 18 ){
			System.out.println("Voter is Eligible");
		}else if(age < 18 && age > 0){
			System.out.println("Voter is not Eligible");
		}else{
			System.out.println("Invalid Number");
		}
	}
}
