class Outer {
	class Inner {
		void run() {
			System.out.println("In run Method");
		}
	}
	void fun() {
		System.out.println("In fun Method");
	}
	public static void main(String [] args){
		Outer outObj = new Outer();
		outObj.fun();
		Inner obj = outObj.new Inner();
		obj.run();
	}
}
