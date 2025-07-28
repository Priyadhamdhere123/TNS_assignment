interface Demo {
	void fun();
	default void run(){
	}
	static void mun() {
	}
}
class Outer {
	public static void main(String [] args){
		Demo obj = () -> {
			System.out.println("In Lambda Function");
		};
		obj.fun();
	}
}
