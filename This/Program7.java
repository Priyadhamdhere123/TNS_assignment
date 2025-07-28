class Demo {
	int x = 10;
	int y = 30;
	Demo() {
		this(20);0
		System.out.println("Constructor-1");
	}
	Demo(int x) {
		this();
		System.out.println("Constructor-2");
	}
	public static void main(String [] args){
		Demo obj = new Demo();
	}
}
