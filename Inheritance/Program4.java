class Parent {
	int x = 10;
	static int y = 20;

	Parent(){
		System.out.println("In Parent Constructor");
	}

	void run() {
		System.out.println("In Run Method");
	}

	static void fun(){
		System.out.println("In Fun Method");
	}
}
class Child extends Parent {
	Child() {
		System.out.println("In Child Constructor");
	}

	public static void main(String [] args){
		Child cObj = new Child();

		System.out.println(cObj.x);
		System.out.println(cObj.y);
		cObj.run();
		cObj.fun();
	}
}

