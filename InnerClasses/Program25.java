class Outer {
	static int x = 10;
	static void fun() {
		System.out.println("In Fun Method");
	}
	static class Inner {
		static int x = 20;
		Inner(int x) {
			System.out.println(Outer.x); //10
			System.out.println(x);       //30
			System.out.println(Inner.x); //20
			fun();
		}
	}
}
class Client {
	public static void main(String [] args){
		Outer.Inner obj = new Outer.Inner(30);
	}
}

