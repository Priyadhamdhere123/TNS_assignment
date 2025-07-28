class Demo {
	void fun() {
		System.out.println("In Fun Demo");
	}
}
class Outer {
	public static void main(String [] args){
		Demo obj = new Demo() {
			void fun() {
				System.out.println("In Fun Anonymous-Inner class");
			}
		};
		obj.fun();
	}
}
