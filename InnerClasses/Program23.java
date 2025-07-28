class Outer {
	static int x = 20;
	int y = 30;
	static void fun() {
		System.out.println("In Static fun method");
	}
	void run() {
		System.out.println("In non static run method");
	}
	
	static class Inner {
		Inner() {
		System.out.println(x);
		//System.out.println(y);
		fun();
		//run();
		}
	}
		public static void main(String[] args){
		 
		Outer outObj = new Outer();
		//Inner obj = new Outer().new Inner();
		Inner obj = new Inner();
		}
}	
