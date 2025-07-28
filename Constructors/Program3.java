class Demo {
	int x = 10 ;
	int y = 20 ;
	Demo(int x , int y){
		
		System.out.println(this);
		System.out.println("In Demo Constructor");
		System.out.println(x);
		System.out.println(y);
		this.x=x;
		this.y=x;
	}
	void printData(){
		System.out.println(x);
		System.out.println(y);
	}
}
class ConstDemo {
	public static void main(String [] args){
		Demo obj = new Demo(30,40);
		System.out.println(obj);

		obj.printData();
	}
}
		

