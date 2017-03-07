package Collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public void createHashMap() {
		//for Integer and String objects hashcode() & equal() is override by java internally
		Map<String,Integer>  hsMap = new HashMap<String,Integer> ();
		
			hsMap.put("ID1",101);
			hsMap.put("ID2",102);
			hsMap.put("ID3",103);
			hsMap.put("ID4",104);
		
		Set<Map.Entry<String,Integer>> mapKeyVal = hsMap.entrySet();
	
		for(Map.Entry<String,Integer> keyVal :  mapKeyVal) {
			System.out.println("Key::" + keyVal.getKey() + "  Value::" + keyVal.getValue());
		}
		
		for(Map.Entry<String,Integer> keyVal :  mapKeyVal) {
			if(keyVal.getKey().equals("ID2")) {
				System.out.println('\n'+"Key mathch for::" +keyVal.getKey());
				System.out.println("Value::" +keyVal.getValue());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMapEx  hsMap = new HashMapEx ();
		hsMap.createHashMap();
 	

}
}