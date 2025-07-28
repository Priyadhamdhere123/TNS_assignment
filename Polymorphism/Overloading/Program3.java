class Demo {
	int fun(int x) {
		System.out.println("int");
		return 10;
	}
	float fun(int x) {
		System.out.println("float");
		return 10.5f;
	}
	public static void main(String [] args) {
		Demo obj = new Demo();
	}
}
