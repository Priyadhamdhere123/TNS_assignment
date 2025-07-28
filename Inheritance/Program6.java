class Parent {
	int x = 10;
	Parent() {
		System.out.println("In Parent Constructor");
	}
	void fun() {
		System.out.println("In Fun Parent");
	}
}
class Child extends Parent {
	int x = 20;
	Child() {
		super();
		super();
		System.out.println("In Child Constructor");
		System.out.println(x);
		System.out.println(super.x);
	}

	void fun() {
		System.out.println("In Fun Child");
		super.fun();
		//System.out.println(super);  // Error

	}
	public static void main(String [] args){
		Child obj = new Child();
		obj.fun();
		
	}

}


