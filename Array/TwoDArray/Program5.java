import java.util.*;
class TwoDArrayDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row of Array :");
		int row = sc.nextInt();
		System.out.print("Enter Column of Array :");
		int column = sc.nextInt();
		int arr[][] = new int[row][column];
		
		System.out.print("Enter the Array Element :");
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("Array Element are :");
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println(arr[1][2]);
		System.out.println(arr[1]);
		System.out.println(arr);

	}
}

