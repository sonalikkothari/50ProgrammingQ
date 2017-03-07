package File_IO;
import java.io.*;


       public class DatInStrm {
    	   static DataInputStream in = new DataInputStream(System.in);
    	   	
    	   public void data_Input_Stream() {
		      
		       int number1 = firstNo();
		       System.out.println(number1);
		       int number2 = secondNo();
		       System.out.println(number2);
		       int mult = number1 * number2;
				System.out.println("The multipliction of two numbers::" +mult);
    	   	}
		
    	   
			public static int firstNo() {
    	   		int no1=1;
    	   		
		       System.out.println("Enter the First number");
		       
		try {
			int num1 = in.readInt();
			
			System.out.println(num1);
			no1 =  num1;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return no1;
		}
		
		public static int secondNo() {
			int no2=1;
		System.out.println("Enter the Second number");
		try {
			int num2 = in.readInt();
			no2= num2 ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return no2; 
		}
		
		
		
	}




