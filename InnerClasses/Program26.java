class Demo {
	void fun() {
		System.out.println("In fun");
	}
}
class Outer {
	public static void main(String [] args){
		Demo obj = new Demo();{
		};
		obj.fun();
	}
}

