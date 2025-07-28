class Outer {
	void fun () {
		System.out.println("In Fun Method");

		class Inner {
			Inner() {
				System.out.println("In Inner Constructor");
			}

			void run() {
				class Inner2 {
					Inner2() {
						System.out.println("In Inner2 constructor");
					}
				}
				Inner2 obj2 = new Inner2();
			}
		}
		Inner obj = new Inner();
		obj.run();
	}
	public static void main(String [] args){
	Outer outObj = new Outer();
	outObj.fun();
	}
}

