package Exceptions;

import org.testng.annotations.Test;

import Exceptions.ExceptionThrows;
import Exceptions.NullPointerExcep;

public class Test_Exceptions {

	@Test
	public void test_Null_Pointer_Excep() {
		NullPointerExcep npExcp = null;
		try {
		npExcp.printWbl();
	}
		catch (NullPointerException nullexec) {
			System.out.println("The exception is:: " +nullexec);
		}
		finally {
			System.out.println("The Null Pointer Exception is handled");
		}
}

	@Test
	public void test_Thows_Exception() {
		ExceptionThrows excpThrow = new ExceptionThrows();
		try {
		excpThrow.arith_Except();
		}
			catch( ArithmeticException arth) {
				System.out.println("The arithmetic Exception:: " +arth);
			} 
		finally {
			System.out.println("The Arethmetic Exception is handled..");
		}
	}

}
