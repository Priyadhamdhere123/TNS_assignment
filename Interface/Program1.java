interface Demo {
	void run();  	//public abstract void run();
	void fun();	//public abstract void fun();
}
class Child implements Demo {
	public void run() {
		System.out.println("In Run Method");
	}
	public void fun() {
		System.out.println("In Fun Method");
	}
	public static void main(String [] aegs){
		Child obj = new Child();
		obj.run();
		obj.fun();
	}
}
