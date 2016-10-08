package loop_programs;

public class Swap_2_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swap_2_nos swapno = new Swap_2_nos();
		swapno.number_swap(75 , 30);
	}

	public void number_swap(int num1, int num2) {
		
		//logic- num1=10 ,num2 = 20
		//       num2 = num1 +num2; 30
		//       num1 = num2-num1; 20
		//  	 num2 = num2 - num1; 10
		//     		
		System.out.println("The nos before swapping:"+ num1 + "  " + num2);
		num2 = num1 + num2;
		num1 = num2 - num1;
		num2 = num2 - num1;
		System.out.println("The swapped nos are:" + num1 + "  "+ num2);
		
	}
}
