class Demo {
	void run() {
		System.out.println("In Run-method");
	}
}
class Outer {
	public static void main(String [] args){
		new Demo(){
			void fun() {
				System.out.println("In Fun Method");
			}
		}.fun();
	}
}
