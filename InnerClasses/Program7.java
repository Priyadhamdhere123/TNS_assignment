class Outer {
	int x = 10;
	Outer() {
		System.out.println("In Outer Constructor");
	}

	void run() {
		System.out.println("In Run Outer");
	}
	class Inner {
		int y = 20;
		Inner() {
			System.out.println("In Inner Constructor");
		}

		void fun() {
			System.out.println("In Fun Inner");
		}
	}
	public static void main(String [] args) {
		Outer outObj = new Outer();
		Inner obj = outObj.new Inner();
		outObj.run();
		obj.fun();
		System.out.println(outObj.x);
		System.out.println(obj.y);
	}
}
