class Outer {
	static int x = 10;
	static int y = 20;
	Outer() {
		System.out.println("Outer Constructor");
	}
	class Inner{
		int x = 30;
		Inner() {
			System.out.println("Inner Constructor");
			System.out.println(x);
			System.out.println(y);
			//System.out.println(this$0.x);
			System.out.println(Outer.this.x);
		}
	}
	public static void main(String [] args){
		Inner obj = new Outer().new Inner();
	}
}

