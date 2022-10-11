package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {
		HashMap<String, Integer> compMap = new HashMap<>();
		compMap.put("Google", 10000);
		compMap.put("WallMart", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 5000);
		compMap.put("Cisco", 15000);

		System.out.println("comp map size : " + compMap.size());
		Iterator it = compMap.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}

		// convert hasmap keys tnto arraylist
		List<String> compNameList = new ArrayList<String>(compMap.keySet());
		for (String string : compNameList) {
			System.out.println(string);
		}

		// convert hashmap values into arrayList
		List<Integer> empValuesList = new ArrayList<Integer>(compMap.values());
		System.out.println("Total emp Values Count = " + empValuesList.size());
		for (Integer e : empValuesList) {
			System.out.println(e);
		}

	}
}
