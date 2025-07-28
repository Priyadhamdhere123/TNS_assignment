class Parent {
	Parent() {
		System.out.println("In Parent Constructor");
	}
}
class Child extends Parent {
       	static void fun() {
		System.out.println("In Fun Method");
	}
}
class Client {
	public static void main(String [] args){
		//Child cObj = new Child();
		//cObj.fun();
		Parent pObj = new Parent();
		Child.fun();
	}
}
