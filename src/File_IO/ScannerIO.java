package File_IO;

import java.util.Scanner;

public class ScannerIO {
///Scanner: Use this class to input 2 integer numbers and sum them.
	public void scannerInt() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first int number");
		int num1 = scan.nextInt();
		
		System.out.println("Enter second int number");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		System.out.println("The Sum of two Integers is::" +sum);
		
		scan.close();
		
		
	}
}
