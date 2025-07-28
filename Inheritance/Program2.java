class Parent {
	int x = 10;
	int y = 20;
	static int z = 30;
	Parent() {
		System.out.println("In Parent Constructor");
	}
}
class Child extends Parent {
	Child() {
		System.out.println("In Child Constructor");
	}
	
}
class Client {
	public static void main(String [] args){
		Child obj = new Child();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(Child.z);
	}
}
