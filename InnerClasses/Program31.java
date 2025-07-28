class Demo {
	void fun(Object x) {
		System.out.println(x);
	}
}
class Outer {
	public static void main(String [] args){
		Demo obj = new Demo();
		obj.fun("Priya");
		obj.fun(new String("Priya"));
		obj.fun(new StringBuffer("Priya"));
	}
}
