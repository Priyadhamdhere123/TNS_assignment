class OneDemo {
	 int x = 10;
	static int y = 20;
	 void fun() {
		System.out.println("In Fun Method");
	}

	static void run() {
		System.out.println("In run Method");
	}
//}
//class TwoDemo {
	public static void main(String [] args){
		OneDemo obj = new OneDemo();

		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();
	}
}
