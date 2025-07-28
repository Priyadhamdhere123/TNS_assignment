class JVMInternal{
	public static void main(String [] args){
		int x = 80;
		int y = 80;
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		y = 10;
		System.out.println(System.identityHashCode(y));
	}
}
