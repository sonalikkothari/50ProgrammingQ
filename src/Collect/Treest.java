package Collect;

import java.util.Set;
import java.util.TreeSet;

public class Treest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> trSet = new TreeSet<String> ();
		
		trSet.add("a1");
		trSet.add("a2");
		trSet.add("a3");
		trSet.add("a4");
		trSet.add("b1");
		trSet.add("b2");
		trSet.add("b3");
		trSet.add("b4");
	
		
		
		//String[] series = {"a1","a2","a3","a4","b1","b2","b3","b4"};
		
		/*for(String sortSeries : series) {
			trSet.add(sortSeries);
		}*/
		
		for(String treeSt: trSet) {
			System.out.println(treeSt);
		}
	}
}
