class Demo {
	void fun(int x) {
		System.out.println("In Fun Int");
	}
	void fun(char x) {
		System.out.println("In Fun Char");
	}
	void fun(float x) {
		System.out.println("In Fun Float");
	}
	public static void main(String [] args) {
		Demo obj = new Demo();
		obj.fun(10);
		obj.fun('A');
		obj.fun(10.58f);
	}
}


