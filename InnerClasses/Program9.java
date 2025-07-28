class Outer {
	int x = 10;
	static int y = 20;
	Outer() {
		System.out.println("Outer Constructor");
	}
	class Inner {
		Inner() {
			System.out.println("Inner Constructor");
			 System.out.println(x);
                	 System.out.println(y);
		}
			
	}
	public static void main (String [] args){
		Inner obj = new Outer().new Inner();
}}
