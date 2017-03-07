package String;

public class StringConcat {
		
	 public void string_Concat(String input) {
		 
		 //"This is nice"  This1 is2 nice3
		String[] parts = input.split(" ");
		String part1  =  parts[0];
		String part2 = parts[1];
		String part3 = parts[2];
		System.out.println("The new string is::   " +part1 +"1 "+part2+"2 " +part3 +"3");
		
		  }
}
