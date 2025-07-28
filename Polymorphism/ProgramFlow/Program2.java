class Demo {
	int x = 10;
	Demo() {
		System.out.println("In Constructor");
		System.out.println(x);
	}
	{
		System.out.println("In Instance Block");
	}
	void run() {
		System.out.println("In Instance Run Method");
	}
	public static void main(String [] args){
		Demo obj = new Demo();
		obj.run();
	}
}
