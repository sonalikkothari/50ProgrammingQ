package String;

public class SubString {
	
		//string  "WBL-QA-Training"  find substring "QA" and replace it with "UI"
	public String sub_String(String str) {
		
		System.out.println(str.substring(3,5));
		String output = str.replaceFirst("QA", "UI");
		return output;
	}
		 
}
