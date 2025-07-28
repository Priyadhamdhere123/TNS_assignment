class Demo {
	void run(float x){
		System.out.println("In Run Method");
		System.out.println(x);
	}
}
class XYZ {
	void fun(int y) {
		System.out.println("In Fun Method");
		System.out.println(y);
	}

	public static void main(String [] args){

		Demo obj1 = new Demo();
		obj1.run(10.3f);

		XYZ obj2 = new XYZ();
	       obj2.fun(10);
	}
}	


