package String;

public class RevWordString {
		
	public String str1 = "Welcome to Whitebox Learning";
	public void rev_Word_String() {
		
		//String rvstr = null;
		
		String[] parts = str1.split(" ");
		String part1 = parts[0];
		String part2 = parts[1];
		String part3 = parts[2];
		String part4 = parts[3];
		
		//System.out.println(part1 +part2 +part3 +part4);
		String rvpart1 = rev_String(part1);
		String rvpart2 = rev_String(part2);
		String rvpart3 = rev_String(part3);
		String rvpart4 = rev_String(part4);
		
		System.out.println("The string is:: " +str1);
		System.out.println("The revword string is::  " +rvpart1 + " " +rvpart2 +" " +rvpart3 +" " +rvpart4  );
	}

		public  String rev_String(String part) {
			char[] temp = new char[part.length()];
			String revstr1;
			//String temp = part;
			int j = 0;
				for(int i =(part.length()-1);i>=0;i--) {
					temp[j] = part.charAt(i);
					j++;
			}
				revstr1 = new String(temp);
				return revstr1;
			}
		
		
	
	}
	

