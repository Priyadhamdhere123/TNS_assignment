class Parent {
	// Private Method cannot inherited or Override
	private void fun() {
		System.out.println("In Fun- Parent");
	}

	//Final method also not override
	final void run() {
		System.out.println("In Run Method");
	}
}
class Child extends Parent {
	private void fun() {
		System.out.println("In Fun-Child
	}
}
class Client {
	public static void main(String [] args){
		Child pObj = new Child();
		pObj.fun();
	}
}
