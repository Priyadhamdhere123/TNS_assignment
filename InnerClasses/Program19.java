class Outer {
	void fun() {
		System.out.println("In fun method");

		class Inner {
			int x = 10;
			Inner() {
				System.out.println("In Inner Constructor");
				System.out.println(x);
			}
		}
		Inner obj = new Inner();
	}
	public static void main(String [] args){
		Outer outObj = new Outer();
		outObj.fun();
	}
}
