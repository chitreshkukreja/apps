package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		// 1. sort and then equals:
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B", "A", "C", "D", "F"));

		System.out.println(l1.equals(l2));// false
		Collections.sort(l3);
		System.out.println(l1.equals(l3));

		// 2.Compare 2 list find out additional element
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("B", "B", "C", "D", "F"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("B", "A", "D", "C", "E"));
		l4.removeAll(l5);
		System.out.println(l4);

		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("Java", "Python", "C#", "Ruby", "JS"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "C#", "JS"));

		lang1.retainAll(lang2);
		System.out.println(lang1);
		System.out.println(lang1.equals(lang2));
	}
}
