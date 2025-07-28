class Demo{
	public static void main(String [] args){
		String str1 = "Priya";
		System.out.println(System.identityHashCode(str1));
		String str2 = "Priya";
		System.out.println(System.identityHashCode(str2));
		String str3 = new String("Dhamdhere");
		System.out.println(System.identityHashCode(str3));
		String str4 = new String("Dhamdhere");
		System.out.println(System.identityHashCode(str4));
	}
}
