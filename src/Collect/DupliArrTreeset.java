package Collect;

import java.util.TreeSet;

public class DupliArrTreeset {

	public void findDupliArr() {
		String[] arry = {"QA","WBL","QA","JAVA","UNIX","JAVA"};
		TreeSet<String> dupli = new TreeSet<String> ();
		
		for(String strng : arry) {
			if(!dupli.add(strng)) {
				System.out.println("The duplicate entry is ::  " +strng);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DupliArrTreeset dupliEntry = new DupliArrTreeset();
		dupliEntry.findDupliArr();
	}

}
