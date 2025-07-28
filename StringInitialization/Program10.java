class StringDemo{
	public static void main(String [] args){
		String str1 = "Priya";
		String str2 = "Dhamdhere";
		String str3 = "PriyaDhamdhere";
		String str4 = str1 + str2;
		String str5 = str4;

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
	}
}
