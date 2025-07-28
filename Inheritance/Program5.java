class Parent {
	int x = 10;

	Parent(){
		System.out.println("In Parent Constructor");
	}

	 void fun(){
		System.out.println("In Fun Method");
	}
}
class Child extends Parent {
	int y = 20;
	Child() {
		System.out.println("In Child Constructor");
	}
	 void run() {
                System.out.println("In Run Method");
        }

	public static void main(String [] args){
		Child cObj = new Child();

		System.out.println(cObj.x);
		System.out.println(cObj.y);
		cObj.run();
		cObj.fun();
	}
}

