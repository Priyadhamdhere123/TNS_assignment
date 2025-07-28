interface Demo {
	void fun();
}
class Outer {
	public static void main(String [] args){
		Demo obj = () -> {
			System.out.println("In Lambda Fun");
		};
		obj.fun();
	}
}

