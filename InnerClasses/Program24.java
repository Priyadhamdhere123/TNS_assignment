class Outer {
	static int x = 10;
	static void fun() {
		System.out.println("In static fun method");
	}
	static class Inner{
		Inner(){
		System.out.println(x);
		fun();
		}
	}
}
class Client {
	public static void main(String [] args){
		Outer.Inner obj = new Outer.Inner();
	}
}
