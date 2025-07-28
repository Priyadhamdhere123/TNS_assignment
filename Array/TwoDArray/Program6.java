import java.io.*;
class ArrayDemo{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
		System.out.print("Enter row :");
		int row =Integer.parseInt(br.readLine());
		System.out.print("Enter column :");
		int column = Integer.parseInt(br.readLine());
		int arr[][] = new int[row][column];
		System.out.println("Enter the Element :");
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Elements of Arrya are :");
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
