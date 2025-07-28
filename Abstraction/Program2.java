abstract class Parent {
	void career() {
		System.out.println("Software Engineering");
	}
	public abstract void marry();
}
class Child extends Parent {
	void marry() {
		System.out.println("Sam");        // weaker access privilage
	}
	public static void main(String [] args){
		Parent obj = new Child();
		obj.career();
		obj.marry();
	}
}


