class Demo {
	Demo() {
		System.out.println("In constructor");
	}
	void run() {
		System.out.println("In Run Method");
	}

	public static void main(String [] args){
		Demo obj = new Demo();

		obj.run();
	}
}

