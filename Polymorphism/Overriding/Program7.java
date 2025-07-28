class Parent {
	private Object fun() {
		return new Object();
	}
}
class Child {
	private String fun() {
		return new String("Priya");
	}
}
	public static void main (String [] args) {
		Parent p = new Child();
		p.fun();
	}
}
	

