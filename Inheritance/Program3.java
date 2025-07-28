class Parent {
	int x = 30;
	int y = 40;

	Parent() {
		System.out.println("In Parent Constructor");
	}
}
class Child extends Parent {
	int x = 10;
	int y = 20;
	Child(){
		System.out.println("In Child Constructor");
		System.out.println(x);
		System.out.println(y);
		System.out.println(super.x);
		System.out.println(super.y);
	
	}
}
class Client {
	public static void main(String [] args){
		Parent pObj = new Child();
	}
}

