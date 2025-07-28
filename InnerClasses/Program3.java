class Parent {
	void fun(){
		System.out.println("In fun Parent");
	}
}
class Child extends Parent {
	void fun() {
		//super.fun();
		System.out.println("In Fun Child");
		super.fun();
	}
	public static void main(String [] args) {
		Child obj = new Child();
		obj.fun();
	}
}
