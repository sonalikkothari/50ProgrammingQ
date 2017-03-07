package String;

import org.testng.annotations.Test;

import String.PalindromeString;
import String.RevWordString;
import String.Reverse_String;
import String.StringConcat;
import String.SubString;

public class Test_String {

	@Test
	public void test_Rev_Str() {
		Reverse_String rvstr = new Reverse_String();
		String revString = rvstr.rev_Str();
		System.out.println("The reverse of a string is::   " +revString);
	}
	
	@Test
	public void test_SubStr() {
		SubString subStr = new SubString();
		String result = subStr.sub_String("WBLQATraining");
		System.out.println("The substring is::  " +result); 
	}
	
	
	@Test
	public void test_String_Concat() {
		StringConcat strcat = new StringConcat();
		 strcat.string_Concat("This is nice");
		
	}
	
	@Test
	public void test_Rev_Wrd_Str() {
		RevWordString rvwrd = new RevWordString();
	    rvwrd.rev_Word_String();
	}
	
	@Test
	public void test_Palindrm_Str() {
		PalindromeString palndrm = new PalindromeString();
		palndrm.pallindrome_Str("nan nan nan");
	}
	
	
	
}
