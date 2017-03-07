package Collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapSort {

	public void createTreeMap() {
		//for Integer and String objects hashcode() & equal() is override by java internally
		Map<String,Integer>  trMap = new TreeMap<String,Integer> ();
		
		 	trMap.put("ID3",113);
		    trMap.put("ID2",142);
		    trMap.put("ID1",199);
		    trMap.put("ID4",10);
		
		Set<Map.Entry<String,Integer>> mapKeyVal = trMap.entrySet();
	
		for(Map.Entry<String,Integer> keyVal :  mapKeyVal) {
			System.out.println("Key::" + keyVal.getKey() + "  Value::" + keyVal.getValue());
		}
		
		/*for(Map.Entry<String,Integer> keyVal :  mapKeyVal) {
			if(keyVal.getKey().equals("ID2")) {
				System.out.println('\n'+"Key mathch for::" +keyVal.getKey());
				System.out.println("Value::" +keyVal.getValue());
			}
		}*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MapSort  mpSort = new MapSort ();
		mpSort.createTreeMap();
 	

}
}
	