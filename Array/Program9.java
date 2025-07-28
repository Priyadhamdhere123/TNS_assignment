import java.util.*;
class ArrayDemo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Size of Array :"+ arr.length);
		System.out.println("Enter the Array Element :");
		for(int i= 0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Element are :");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}

