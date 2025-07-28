class HeapDemo{
	public static void main(String [] args){
		String str1 = new String("Priya");
		String str2 = new String("Core2web");
		String str3 = new String("Priya");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}
