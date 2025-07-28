class Demo {
	int x = 10;
	Demo() {
		this(10);
		System.out.println("No-args Constructor");
	}
	
	Demo(int x) {
		System.out.println("Para-1 constructor");
	}
	Demo(int x , int y) {
		System.out.println("Para-2 constructor");
	}

	public static void main(String [] args){
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(10);
		Demo obj3 = new Demo(20,30);
	}
}
