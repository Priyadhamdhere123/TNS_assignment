import java.io.*;
class OneDArray{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Size Of Array :");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Size of Array :"+ arr.length);
		System.out.println("Enter the Array Element are :");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
	       	System.out.println("Array Element are :");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}


