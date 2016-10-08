package loop_programs;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial fact = new Factorial();
		fact.cal_factorial(9); 
		fact.cal_factorial(0); 
		
	}

	
	public void cal_factorial(int num) {
		
		//logic- 5! = 5*4*3*2*1 = 120 
		
		int fact = 1;
		
		for(int i =1; i<= num ; i++) {
			
			fact = fact * (i);
		}
		System.out.println("The factorial of " + num +" is :" + fact);
	}
}
