class Outer {
	int x = 10;
	int y = 20;
	Outer() {
		System.out.println("Outer Constructor");
	}
	class Inner {
		int x = 30;
		Inner(int x) {
			System.out.println("Inner Constructor");
			System.out.println(this.x); //120
			System.out.println(x); //30
		}
	}
	public static void main(String [] args){
		Inner obj = new Outer().new Inner(120);
	}
}
