package String;

public class ValParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "sd((df)as(asc)";
		int count1=0,count2=0;
		
			for(int i =0;i<str1.length();i++){
				if(str1.charAt(i) == '(')
				     count1++;
			}
			System.out.println(count1);
			
			for(int i =0;i<str1.length();i++){
				if(str1.charAt(i) == ')')
				     count2++;
			}
			System.out.println(count2);
			
			if(count1 == count2)
				System.out.println("Given string has balanced parenthesis");
			else
				System.out.println("Given string has unbalanced parenthesis");
			
	}

}
