package loop_programs;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Factorial factor = new Factorial();
		factor.cal_factorial(9); 
		factor.cal_factorial(0); 
		
		int fact=1;
		fact = factor.fact_recursion(9);
		System.out.println("The factorial is :" + fact);
		fact = factor.fact_recursion(0);
		System.out.println("The factorial is :" + fact);
		fact = factor.fact_recursion(5);
		System.out.println("The factorial is :" + fact);
		
	}

	
	public void cal_factorial(int num) {
		
		//logic- 5! = 5*4*3*2*1 = 120 
		
		int fact = 1;
		
		for(int i =1; i<= num ; i++) {
			
			fact = fact * (i);
		}
		System.out.println("The factorial of " + num +" is :" + fact);
	}


	public int fact_recursion(int num) {
				
		if(num ==0) {
			
			return 1;
			
		} else {
			
			return (num * fact_recursion(num-1));
		}
	}

}
