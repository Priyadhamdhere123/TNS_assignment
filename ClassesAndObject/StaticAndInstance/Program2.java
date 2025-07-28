class Demo {
	int x = 10;
	static int y = 20;
	String str = "Priya";
	public static void main(String [] args){
		int a = 20;
		int b = 20;
		int c = 10;

		Demo obj = new Demo();

		System.out.println(System.identityHashCode(obj.x));
		 System.out.println(System.identityHashCode(obj.y));
		  System.out.println(System.identityHashCode(obj.str));
		   System.out.println(System.identityHashCode(a));
		    System.out.println(System.identityHashCode(b));
		    System.out.println(System.identityHashCode(c));
	}
}

