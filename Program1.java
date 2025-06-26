class PrimeNumber {
	public static void main (String [] args){
		int number = 3;
		int count = 0;
		for(int i = 1; i<= number ; i++){
			if(number % i ==0) {
				count++;
			}
		}
		if(count == 2 ){
			System.out.println(number + " is prime number ");
		}else {
			 System.out.println(number + " is not prime number ");
		}
	}
}











