package loop_programs;

public class Display_Ping_pong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Display_Ping_pong dsply = new Display_Ping_pong();
		dsply.printpingpong(6);
		dsply.printpingpong(20);
		dsply.printpingpong(15);
		dsply.printpingpong(23);
		
	}

	public void printpingpong(int num) {
		
		if(num %3 == 0 && num %5 == 0 ) {
			System.out.println("The Entered number is divisible by 3 & 5 : PING-PONG");	
			
				
		} else if(num % 3 == 0) {
			System.out.println("The Entered number is divisible by 3: PING");
				
		} else if(num % 5 == 0) {
			System.out.println("The Entered number is divisible by 5: PONG");
			
		}  else {
			System.out.println("The Entered number is :"  + num);
		}
	}
}
