class Demo {
	static int x = 10;
	int y = 20;
	static void fun() {
		System.out.println("In static method");
	}
	void run() {
		System.out.println("In Non static method");
	}
}
class Client {
	public static void main(String [] args){
		Demo obj = new Demo();
		System.out.println(Demo.x);
		Demo.fun();
		System.out.println(obj.y);
		obj.run();
	}
}
