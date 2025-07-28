class Parent {
	Object fun() {
		return new Object();
	}
}
class Child extends Parent {
 	String fun() {
		return new String("Priya");
	}
}
class Client {
	public static void main(String [] args) {
		Child cObj = new Child();
	}
}
