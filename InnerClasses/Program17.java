class Outer {
	Outer() {
		System.out.println("In Outer Constructor");
	}
	class Inner1 {
		Inner1() {
			System.out.println("In Inner1 Constructor");
		}
		class Inner2 {
			Inner2() {
				System.out.println("In Inner2 Constructor");
			}
		}
	}
	public static void main(String [] args){
		Outer outObj = new Outer();
	//	Outer.Inner1 innerObj1 = outObj.new Inner1();
		Inner1 innerObj1 = outObj.new Inner1();
	//	Inner1.Inner2 innerObj2 = innerObj1.new Inner2();
		Inner1.Inner2 innerObj2 =new Outer().new Inner1().new Inner2();
	}


}

