class Demo {
	int x = 0;
	Demo(int x) {
		x=x;
		System.out.println("In Constructor");
		System.out.println(x);
	}
	void fun() {
		System.out.println(x);
	}
	public static void main(String [] args) {
		Demo obj = new Demo(120);
		obj.fun();
	}
	
}
