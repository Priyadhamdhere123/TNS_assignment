class Demo {
}
class DemoChild extends Demo {
}
class Parent {
	public Object fun() {
		return new Object();
	}
	Object run() {
		return new Object();
	}
}
class Child extends Parent {
	String fun() {
		return new String("Priya");
	}
	DemoChild run() {
		return new DemoChild();
	}
}
class Client {
	public static void main(String [] args) {
	}
}

