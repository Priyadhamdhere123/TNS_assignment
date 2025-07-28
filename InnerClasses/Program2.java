class Parent {
	void fun(){
		System.out.println("In fun Parent");
	}
}
class Child {
	void fun() {
		System.out.println("In Fun Child");
	}
	public static void main(String [] args) {
		Child obj = new Child();
		obj.fun();
	}
}
