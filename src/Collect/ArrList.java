package Collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrList {

	public void createArrLst() {
		strArrLst();
		intgArrLst();
		 usrDefObj();
		
 	}
	
	public void strArrLst() {
		List<String> arrLstObj = new ArrayList<String> ();
		arrLstObj.add("Java");
		arrLstObj.add("Unix");
		arrLstObj.add("Sql");
		arrLstObj.add("QA");
		
		//System.out.println( arrLstObj.contains("QA"));
		for(String dislst : arrLstObj) {
			System.out.println(dislst);
		}
		
		
		Iterator<String> itr = arrLstObj.iterator();
		System.out.println("Using Iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Search String QA in Arraylist :: ");
		System.out.println("QA is present in the Arraylist :: " + arrLstObj.contains("QA"));
		
		System.out.println("*******************");
		ListIterator<String> lstitr =  arrLstObj.listIterator(arrLstObj.size());
		
		System.out.println("Using ListIterator Reverse the elements of an ArrayList");
		
		while(lstitr.hasPrevious()) {
			System.out.println(lstitr.previous());
			
		}
		
	}
	
	
	public void intgArrLst() {
		List<Integer> arrLstObj1 = new ArrayList<Integer> ();
		arrLstObj1.add(10);
		arrLstObj1.add(20);
		arrLstObj1.add(30);
		arrLstObj1.add(40);
		
		for(Integer dislst : arrLstObj1) {
			System.out.println(dislst);
		}
		
		Iterator<Integer> itr = arrLstObj1.iterator();
		System.out.println("Using Iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("Search integer 30  in Arraylist :: ");
		System.out.println("int 30 is present in the Arraylist :: " + arrLstObj1.contains(30));
		
		System.out.println("*******************");
		ListIterator<Integer> lstitr =  arrLstObj1.listIterator(arrLstObj1.size());
		
		System.out.println("Using ListIterator Reverse the elements of an ArrayList");
		
		while(lstitr.hasPrevious()) {
			System.out.println(lstitr.previous());
			
		}
	}
	
	public void usrDefObj() {
		Account acc1 = new Account();
			acc1.name = "Sonali";
			acc1.accountId = 100;
			acc1.balance =  2000.0f;
		
		Account acc2 = new Account();
			acc2.name = "Kapil";
			acc2.accountId = 200;
			acc2.balance =  10000.0f;
			
		List<Account> arrLstObj2 = new ArrayList<Account> ();
			arrLstObj2.add(acc1);
			arrLstObj2.add(acc2);
			
			Iterator<Account> itr = arrLstObj2.iterator();
			System.out.println("Using Iterator");
			while(itr.hasNext()) {
				System.out.print(itr.next().accountId);
								
			}
			 
			System.out.println();
		for(Account disLst :arrLstObj2 ) {
			System.out.println("ID:: " +disLst.accountId +"   name:: " +disLst.name + "   Balance:: " +disLst.balance);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrList arrayLst = new ArrList();
		arrayLst.createArrLst();
	}

}
