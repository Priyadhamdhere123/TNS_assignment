class Parent {
	void marry() {
		System.out.println("Alia Bhat");
	}
}
class Child extends Parent {
	void marry() {
		System.out.println("Disha Patni");
	}
}
class Client {
	public static void main(String [] args) {
	//	Child Cobj = new Child();
	//	Cobj.marry();
	//	Parent pObj = new Parent();
	//	pObj.marry();
		Parent pObj = new Child();
		pObj.marry();
	}
}

