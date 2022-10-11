package setconcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSetConcepts {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("Alpha");
		hs.add("Testing");
		hs.add("Beta");
		hs.add("Alpha");
		hs.add("Alpha");
		hs.add(null);

		System.out.println(hs);

		System.out.println(hs.contains("Testing"));
		System.out.println(hs.contains("testing"));

		for (String e : hs) {
			System.out.println(e);
		}

		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		hs.remove("Beta");
		System.out.println(hs);
		hs.remove(1);
		System.out.println(hs);

		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(1, 3, 5, 7, 9));

		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(0, 2, 4, 6, 8, 10, 2));

		// get the union
		Set<Integer> union = new HashSet<>(first);
		union.addAll(second);
		System.out.println(union);
		System.out.println("----------------------");

		// get the intersection
		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println("intersection " + intersection);

		// get the differences
		Set<Integer> diff = new HashSet<>();
		diff.removeAll(second);
		System.out.println("differences " + second);

	}
}
