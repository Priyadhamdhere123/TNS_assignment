class Outer {
	static int x = 10;
	static void run() {
		System.out.println("In Static Method");
	}
	class Inner {
		int y = 20;
		void fun() {
			System.out.println("In fun Method");
			System.out.println(x);
			run();
		}
	}
	public static void main(String [] args){
		Outer outObj = new Outer();
		Inner obj = outObj.new Inner();
		obj.fun();
		System.out.println(obj.y);
	}
}
