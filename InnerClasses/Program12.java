class Outer {
	int x = 10;
	static int y = 20;
	Outer() {
		System.out.println("In Outer Constructor");
	}
	class Inner {
		int x = 30;
		Inner() {
			System.out.println("In Inner Constructor");
			System.out.println(x);
                	System.out.println(y);
                	System.out.println(this.x);
		}
	}
		
		public static void main(String [] args){
		Inner obj = new Outer().new Inner();
	
}}
