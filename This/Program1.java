class Demo {
	int x = 10;
	
	Demo() {
		System.out.println(this);
		System.out.println("No argu Constructor");
	}
	Demo(int x){
		System.out.println(this);
		System.out.println("In Paramaterized Constructor");
	}

	public static void main(String [] args){
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(10);
	}
}

