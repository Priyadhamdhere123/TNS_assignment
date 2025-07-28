class Parent {
	void fun() {
		System.out.println("In Fun Parent");
	}
}
class Child extends Parent {
	public static void main(String [] args){
		Child obj = new Child();
		obj.fun();
	}
}

