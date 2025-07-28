class Parent{
}
class Child extends Parent {
}
class Demo {
	void fun(Parent obj) {
		System.out.println("In fun method - Parent");
	}
	void fun(){
		System.out.println("In Fun Method");
	}
}
class Outer {
	public static void main(String [] args){
		Demo obj = new Demo();
		obj.fun(new Parent());

		obj.fun(new Child());
	}
}
