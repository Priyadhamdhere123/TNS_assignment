interface MacD {
	default void burger(){
		System.out.println("Making Burger");
	}
	default void fries() {
		System.out.println("Making Fries");
	}
	void revenue();
}
class SinhgadMacD implements MacD {
	/*public void burger() {
		System.out.println("Making Burger");
	}
	public void fries() {
		System.out.println("Making Fries");
	}*/
	public void revenue() {
		System.out.println("1 cr ");
	}
}
class DhayariMacD implements MacD {
	/* public void burger() {
                System.out.println("Making Burger");
        }
        public void fries() {
                System.out.println("Making Fries");
        }*/
        public void revenue() {
                System.out.println("2 cr ");
        }
}
class PetrolPumpMacD implements MacD {
	 /*public void burger() {
                System.out.println("Making Burger");
        }
        public void fries() {
                System.out.println("Making Fries");
        }*/
        public void revenue() {
                System.out.println("3 cr ");
        }
}
class Client {
	public static void main(String [] args){
	SinhgadMacD obj1 = new SinhgadMacD();
	obj1.burger();
	obj1.fries();
	obj1.revenue();

	DhayariMacD obj2 = new DhayariMacD();
	obj2.burger();
        obj2.fries();
        obj2.revenue();

	PetrolPumpMacD obj3 = new PetrolPumpMacD();
	obj3.burger();
        obj3.fries();
        obj3.revenue();
	}
	
}

