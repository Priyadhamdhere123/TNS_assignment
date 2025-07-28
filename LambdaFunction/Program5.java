interface Demo{
	void fun(int x,int y);
}
class Outer {
	public static void main(String [] args){
		
		//Lambda Function

		/*Demo obj = (int x , int y) -> {
			System.out.println("In Lambda Function Fun");
			System.out.println(x+y);
		};
		obj.fun(10,20);*/
		
		// Anonymous Class

		Demo obj = new Demo() {
			public void fun(int x , int y) {
				System.out.println("In Fun-Anonymous Class");
				System.out.println(x+y);
			}
		};
		obj.fun(10,20);

	}
}


