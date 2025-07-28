class StringMethods {
	public static void main(String [] args){

		String str1 = "Priya";
		String str2 = new String("Priya");
		String str3 = "Priyu";
		String str4 = "Dhamdhere";
		String str5 = "Priyu";
		String str6 = "  Priya  Dhamdhere    ";
		// 1. Concatenate
		str1 = str1.concat(str4);
		System.out.println(str1.concat(str2));
		System.out.println(str1);
		
		//2. Length
		System.out.println(str4.length());

		//3. charAt
		System.out.println(str3.charAt(3));

		//4. compareTo
		System.out.println(str1.compareTo(str3));

		//5.equals
		System.out.println(str5.equals(str3));

		//6.indexOf
		System.out.println(str4.indexOf('m'));
		System.out.println(str2.indexOf('y',1));

		//7.replace
		System.out.println(str3.replace('u','a'));

		//8.substring
		System.out.println(str2.substring(1));
		System.out.println(str1.substring(1,10));

		//9.toLowerCase and toUpperCase
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());

		//10.trim()
		System.out.println(str6.trim());
	}
}
