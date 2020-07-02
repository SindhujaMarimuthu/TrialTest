package Scuba.javatraining;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		//Map<Integer,String> map = new LinkedHashMap	();
		//Map<Integer,String> map = new TreeMap();
		Map<Integer,String> map = new HashMap();
		map.put(4, "England");
		map.put(1, "India");
		map.put(3, "KSA");
		map.put(2, "Bahrain");
		
		System.out.println(map);
		
		Iterator itr = map.keySet().iterator()
				
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
