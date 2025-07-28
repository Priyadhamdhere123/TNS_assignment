class Demo {
	void fun(int x, int y) {
		System.out.println("int-int");
	}
	void fun(int x, float y) {
		System.out.println("int-float");
	}
	void fun(float x, float y) {
		System.out.println("float-float");
	}
	public static void main(String [] args){
		Demo obj = new Demo();
		obj.fun(10,20);
		obj.fun(30,30.8f);
		obj.fun(80.2f,65.23f);
	}
}
