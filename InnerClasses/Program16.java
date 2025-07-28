class Demo {
	int x = 10;
	Demo(int x) {
		System.out.println(x);
		System.out.println(this.x);
	}
	class Inner {
		int x = 30;
		Inner(int x) {
		
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Demo.this.x);
		}
	}
	public static void main(String [] args){
		Demo outObj = new Demo(50);
		Inner obj = outObj.new Inner(40);
	}
}
