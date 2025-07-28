class Parent {
	int x = 10;
	void fun(){
		System.out.println("In Fun Method-Parent");
	}
}
class Child extends Parent {
	int x = 20;
	void fun(){
		System.out.println("In Fun Method-Child");
	}
}
class Client {
	public static void main(String [] args){
		
		Parent pObj = new Parent();
		System.out.println(pObj.x);
		pObj.fun();
		
		Child cObj = new Child();
		System.out.println(cObj.x);
		cObj.fun();

		Parent obj = new Child();
		System.out.println(obj.x);
		obj.fun();
	}
}
