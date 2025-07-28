class StringDemo{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer("Priya");

		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.capacity());	
		
      //		sb = sb + "Dhamdhere"; // Error
		sb = sb.append("Dhamdhere");
		 

	 	System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.capacity());
	}
}
