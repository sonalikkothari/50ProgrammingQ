package loop_programs;

import java.util.Scanner;

public class Inputcmdprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username;
		int loginid;
		String course;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		username = scan.next();
		
		System.out.println("Enter your id:");
		loginid = scan.nextInt();
		
		System.out.println("Enter course QA/UI");
		course = scan.next();
		
		System.out.println(String.format("%s, Loginid is %d, %s",username,loginid,course ));
	}

	
}
/* output
Enter your name:
Sonali
Enter your id:
12
Enter course QA/UI
QA
Sonali, Loginid is 12, QA
 */
 