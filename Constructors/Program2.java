class Demo {
	Demo(int x) {
		System.out.println(x);
		System.out.println("In Constructor");
	}
	void Demo() {
		System.out.println("In Demo Method");
	}
}
class ConstDemo {
	public static void main(String [] args){
		System.out.println("Start Main");
		Demo obj = new Demo(10);
		System.out.println("End Main");
	}
}



