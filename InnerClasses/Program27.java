class Demo {
       void fun() {
       	System.out.println("In Fun");
	}
}
class DemoChild extends Demo{
	void fun() {
		System.out.println("In Fun DemoChild");
	}
}
class Outer {
	public static void main(String [] args){
		Demo obj = new Demo();
		obj.fun();
		DemoChild obj2 = new DemoChild();
		obj2.fun();
		Demo obj3 = new DemoChild();
		obj3.fun();
	}
}

