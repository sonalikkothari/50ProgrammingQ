package String;

public class Reverse_String {
		
	String str = "SONALI";
	String revstr;
	char[] temp = new char[str.length()];
	
	public  String rev_Str() {
	
	int j = 0;
		for(int i =(str.length()-1);i>=0;i--) {
			temp[j] = str.charAt(i);
			j++;
	}
		revstr = new String(temp);
		return revstr;
	}
	
}
