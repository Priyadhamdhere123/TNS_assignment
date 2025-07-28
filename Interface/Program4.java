interface Demo {
	void run();
	void fun();
}
abstract class Child1 implements Demo {
	public void run() {
	}
}
/*class Child2 implements Demo extends Child1 {
       public void fun(){          // first extends karaych nantar implement karaych
       }
} */
//Multiple Inheritance
class Child2 extends Child1 implements Demo {
	public void fun() {
	}
}
