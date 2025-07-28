class Parent {
	// Private Method cannot inherited or Override
	private void fun() {
		System.out.println("In Fun- Parent");
	}

	//Final method inherite but not override
	final void run() {
		System.out.println("In Run Method");
	}

	//Static mehod Inherite hotat pan tyana aapn override nahi karu shakat
	static void mun() {
		System.out.println("In Mun Method");
	}
}
class Child extends Parent {
	private void fun() {
		System.out.println("In Fun-Child");
	}
}
class Client {
	public static void main(String [] args){
		Parent pObj = new Child();
		pObj.run();
		Parent.mun();
	}
}
