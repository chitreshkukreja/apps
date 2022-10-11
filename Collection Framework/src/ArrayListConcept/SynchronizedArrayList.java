package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		// 1.Collections.synchronizedList
		//List<String> nameList = Collections.synchronizedList(new ArrayList<>());
		List<String> nameList = new ArrayList<>();
		nameList.add("Java");
		nameList.add("Python");
		nameList.add("Ruby");

		// add remove we dont need explicit synchronization
		// to fetch/traverse the value from list -- we have to use explicit
		// synchronization

		synchronized (nameList) {

			Iterator<String> it = nameList.iterator();

			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
		System.out.println("--------------");
		// 2. CopyOnWriteArrayList -- its a class: Thread-safe / synchronized already
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Steave");
		empList.add("Naveen");
		empList.add("John");

		// we dont need explicitely synchronization for any operation:
		// add/remove/traverse

		Iterator<String> its = empList.iterator();
		while (its.hasNext()) {
			System.out.println(its.next());
		}
	}
}
