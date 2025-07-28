class Demo {
	void fun() {
		System.out.println("In Demo-Fun");
	}
	void run() {
		System.out.println("In Demo-Run");
	}
}

class Outer {
	public static void main(String [] args){
		Demo obj = new Demo() {
		
        void fun() {
                System.out.println("In Anonymous-fun");
        }
        void run() {
                System.out.println("In Anonymous-Run");
        }
		};
	obj.fun();
	obj.run();
	}
}	

