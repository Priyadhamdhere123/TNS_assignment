interface Demo {
	abstract void fun();
}
class Outer {
	public static void main(String [] args){
		Demo obj = new Demo() {
			public void fun(){
			System.out.println("In Fun");
			}
		};
		obj.fun();
	}
}
