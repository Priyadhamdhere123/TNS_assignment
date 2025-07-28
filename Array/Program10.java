import java.util.*;
class ArraySum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array :");
		int size = sc.nextInt();
		int arr [] = new int[size];
		System.out.println("Size of Array :");
		System.out.println("Enter the Element of Array :");
		for(int i =0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are :");
		int sum =0;
		for(int i=0 ; i<arr.length; i++){
			System.out.println(arr[i]);
			sum=sum+arr[i];
		}
		System.out.println("Sum of Array Element is :"+ sum);
	}
}

