class Demo {
}
class DemoChild extends Demo {
}
class Parent {
	private Object fun() {
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
	public DemoChild run() {
		return new DemoChild();
	}
}
class Client {
	public static void main(String [] args) {
	}
}

