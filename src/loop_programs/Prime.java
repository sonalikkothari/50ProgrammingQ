package loop_programs;

public class Prime {
	//find a number is prime or not
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime findprime = new Prime();
		findprime.cal_prime_no(5);
		findprime.cal_prime_no(12);
		findprime.cal_prime_no(7);
		findprime.cal_prime_no(66);
		findprime.cal_prime_no(11);
		findprime.cal_prime_no(13);
		findprime.cal_prime_no(34);
		findprime.cal_prime_no(61);
	}

	
	public void cal_prime_no(int num) {
		
		int prime = 0;
		for(int i=1; i<=num; i++) {
			
			if(num % i == 0) {
				prime += 1;
			}
		}
		if(prime == 2) {
			System.out.println("The number " + num + " is a prime number");
		} else {
			System.out.println("The number " +num+" is not a prime no");
		}
	}
}
