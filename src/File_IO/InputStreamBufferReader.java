package File_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamBufferReader {

	public void inputStream_BufferReader() throws IOException {
		
		InputStreamReader inpstream = new InputStreamReader(System.in);
		BufferedReader bufreader = new BufferedReader(inpstream);
		
		System.out.println("Enter first int number");
		int num1 = Integer.parseInt(bufreader.readLine());
		
		System.out.println("Enter second int number");
		int num2 = Integer.parseInt(bufreader.readLine());
		
		int sub = num1 - num2;
		System.out.println("The Subtraction of two int numbers is::" +sub);
	}
}

