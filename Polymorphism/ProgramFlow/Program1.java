class Demo {
	static int x = 10;
	Demo() {
		System.out.println("In Constructor");
	}
	static{
		System.out.println("In Static block");
		System.out.println(x);
	}
	static void run() {
		System.out.println("In Static method");
	}
	public static void main(String [] args){
		System.out.println("In Main");
		Demo obj = new Demo();
		run();
	}
}
