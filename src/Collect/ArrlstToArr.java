package Collect;

import java.util.ArrayList;
import java.util.List;

public class ArrlstToArr {
	 
	public void arrLstToarr() {
		List<String> arrLst = new ArrayList<String> ();
		
		arrLst.add("Black");
		arrLst.add("White");
		arrLst.add("Grey");
		arrLst.add("Pink");
		arrLst.add("Red");
		 
		 String[] arr = new String[arrLst.size()];
		 
		 for(String newArr : arr) {
			 System.out.println(newArr);
		 }
		 
		 for(int i=0;i<arrLst.size();i++) {
		arrLst.toArray(arr);
		 }
		 
		 for(String prnarr : arr) {
			 System.out.println(prnarr);
		 }
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ArrlstToArr arLstToArr = new ArrlstToArr();
		arLstToArr.arrLstToarr();

}
}
