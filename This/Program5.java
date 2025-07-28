class Demo {
	int x = 10;
	Demo() {
		this(20);
		System.out.println("No-args constructor");
		System.out.println(x);
	}
	Demo(int x) {
		System.out.println("Parametrized Constructor");
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String [] args) {
		Demo obj = new Demo();
	}
}
