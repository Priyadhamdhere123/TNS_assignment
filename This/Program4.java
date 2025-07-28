class Demo {
	Demo() {
		this();
		System.out.println("No-args constructor");
	}
	Demo(int x) {
		System.out.println("Para-1 constructor");

	}
	public static void main (String [] args) {
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(10);
	}
}	

