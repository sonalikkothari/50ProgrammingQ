package loop_programs;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fibonacci fib = new Fibonacci();
		fib.fibseries(10);
	}
	
	public void fibseries(int count) {
		int num1 = 0;
		int num2 = 1;
		int num3;
		
/////1 1 2 3 5 8 13 21 34 55		
		for(int i=0; i<count;i++) {
		num3 = num1 + num2;
		num1 = num2;
		num2 = num3;
		
		System.out.println(num1);
		
	}
}
}