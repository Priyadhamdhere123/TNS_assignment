class Parent {
	int marry(String str) {
		System.out.println(str);
		return 10;
	}
}
class Child extends Parent {
	float marry(String str) {
		System.out.println(str);
		return 10.2f;
	}
}
class Client {
	public static void main (String [] args){
		Child cObj = new Child();
		cObj.marry("Alia Bhat");
	}
}

