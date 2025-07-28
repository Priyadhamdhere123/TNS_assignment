class Demo {
	//static void run(){
	void run(){
		System.out.println("In Run Method");
	}
}
class XYZ {
	//static void fun() {
	void fun(){
		System.out.println("In Fun Method");
	}

	public static void main(String [] args){
		Demo obj1 = new Demo();
		XYZ obj2 = new XYZ();
		obj2.fun();
		obj1.run();
	}
}
