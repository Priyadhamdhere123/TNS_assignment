class Demo {
	int x = 10;
	Demo(int x){
		System.out.println("In Demo Constructor");
		System.out.println(x);      //20
		System.out.println(this.x); //10
	}
	void fun(){
		System.out.println("Fun Method ="+ x);
	}

	public static void main(String [] args){
		Demo obj = new Demo(20);
		Demo obj1 = new Demo(30);
		obj1.fun();
		obj.x = 50;
		obj.fun();
		System.out.println(obj.x);
		System.out.println(obj1.x);
	}
}
