package String;

public class PalindromeString {
	
	public void pallindrome_Str(String inpstr) {
		
		String palndrmstr = "";
		
		for(int i =(inpstr.length()-1);i>=0;i--) {
		
			palndrmstr = palndrmstr + inpstr.charAt(i);
		}
		
		if(inpstr.equals(palndrmstr)) 
			System.out.println("The string is a palindrome");
		 else
			System.out.println("The string is not a palindrome");
		
	}
		
	
}
