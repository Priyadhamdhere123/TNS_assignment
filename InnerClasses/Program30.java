class Demo {
	void fun(String x){
		System.out.println("In Fun");
	}
}
class Outer {
	public static void main(String [] args){
		Demo obj = new Demo();
		obj.fun("Priya");
		obj.fun(new String ("Priya"));
	}
}
