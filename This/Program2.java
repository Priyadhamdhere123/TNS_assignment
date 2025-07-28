class Demo {
	static int x = 10;
	int y = 20;
	Demo(){
		System.out.println("In Constructor");
	}
	static {
		System.out.println("In Static block");
		System.out.println(x);
		
	}
	public static void main(String [] args){
		System.out.println("In Main Method");
		System.out.println(x);
		Demo obj = new Demo();
	}
}


