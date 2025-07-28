class Outer {
	void run() {
		System.out.println("In Outer Run");
	}
	class Inner{
	}
	void fun() {
		System.out.println("In Outer Fun");
	}
	public static void main(String [] args){
		Outer obj = new Outer();
		obj.run();
		obj.fun();
	}
}
