class Parent {
	static int x = 30;
	static void fun() {
		System.out.println("In Fun-Parent");
	}
}
class Child extends Parent {
	static int x = 40;
	static void fun() {
		System.out.println("In Fun-Child");
	}
}
class Client{
	public static void main(String [] args){
		Parent pObj = new Parent();
		System.out.println(pObj.x);
		pObj.fun();
		Child cObj = new Child();
		System.out.println(cObj.x);
		cObj.fun();
		Parent obj = new Child();
		System.out.println(obj.x);
		obj.fun();
	}
}
																																																																													
