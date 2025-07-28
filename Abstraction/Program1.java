 abstract class Parent {
	 Parent() {
		 System.out.println("Parent Constructor");
	 }
       void career() {
       		System.out.println("Software Development");
 	}
	abstract void marry();     
}
class Child extends Parent {
	void marry() {
		System.out.println("Sam");
	}
}
class Client {
	public static void main(String [] args){
		Parent obj = new Child();
		obj.career();
		obj.marry();
	}
}
