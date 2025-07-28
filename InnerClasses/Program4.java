class Parent {
	void fun() {
		System.out.println("In Fun Parent");
	}
}
class Child extends Parent {
	void fun() {
		System.out.println("In Fun Child");
	}
	void run() {
		System.out.println("In Run Child");
	}
	public static void main (String [] args) {
		Parent p = new Child();
		p.run();
	}
}

