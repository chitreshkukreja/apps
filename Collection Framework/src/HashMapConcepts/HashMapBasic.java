package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasic {

	public static void main(String[] args) {
		// no order - no index
		// stores value -- key value<k,v>
		// key cannot be duplicate
		// can store n number of null values but only one null key
		HashMap<String, String> capitalMap = new HashMap<>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London11");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA");
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);

		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("UK"));
		System.out.println(capitalMap.get(null));

		// Iterate 1;
		Iterator<String> it = capitalMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println("key " + key + " Value " + capitalMap.get(key));
		}
		// Iterator : Over the set (pair) by using entry set
		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();
		while (it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println("Key = " + entry.getKey() + " and value " + entry.getValue());
		}
		System.out.println("java 8- --------------");
		// iterate hashmap using java 8 for each and lambda
		capitalMap.forEach((k, v) -> System.out.println("Key " + k + " Value " + v));
	}
}
