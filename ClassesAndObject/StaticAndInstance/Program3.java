class One {
	int x = 10;
	static int y = 20;
	void fun() {
		System.out.println("In fun");
	}
	static void run(){
		System.out.println("In run");
	}
}
class Two {
	public static void main(String [] args){
		System.out.println("In main method ");
		One obj = new One();
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();
	}
}

