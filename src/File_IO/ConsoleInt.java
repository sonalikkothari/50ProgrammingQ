package File_IO;
import java.io.Console;
import java.io.IOException;

import static java.lang.System.out;

//import Exceptions.NullPointerExcep;

public class ConsoleInt {

	
			
	
		public void console_int()  {
			
			try {
				Console cons = System.console();
			String str1 = cons.readLine("Enter First no::");
			System.out.println(str1);
			} catch(NullPointerException nul) {
				System.out.println(nul);
			} finally {
			}
		/*	System.out.println("Enter the First number");
			//int num1 = Integer.parseInt(cons.readLine());
			String str = cons.readLine();
			System.out.println(str);
			//System.out.println(num1);
			
			/*System.out.println("Enter the Second number");
			int num2 = Integer.parseInt(cons.readLine());
			
			int div = num1/num2;
			System.out.println("The Division of two nos is::" +div);*/
		//}*/
		
		
	}
	}

