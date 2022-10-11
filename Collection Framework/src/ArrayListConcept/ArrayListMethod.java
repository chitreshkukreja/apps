package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethod {

	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<>();
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("Ruby");
		ar1.add("JavaScript");

		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("Testing");
		ar2.add("dev ops");

		ar1.addAll(ar2);
		System.out.println(ar1);
		ar1.addAll(2, ar2);

		System.out.println(ar1);
		// ar1.clear();
		System.out.println(ar1);

		ArrayList<String> cloneList = (ArrayList<String>) ar1.clone();
		System.out.println(cloneList);

		System.out.println(ar1.contains("Python"));
		System.out.println(ar1.contains("python"));
		System.out.println(ar1.contains("C"));
		System.out.println(ar1.indexOf("ruby") > 0);

		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Naveen", "Tom", "Naveen", "Steave", "Lisa"));
		System.out.println(list1);

		int i = list1.lastIndexOf("Naveen");
		System.out.println(i);
		System.out.println(list1.indexOf("naveen"));

		System.out.println(list1.remove(1));
		System.out.println(list1);

		list1.remove("lisa");
		System.out.println(list1);
		list1.remove("Lisa");
		System.out.println(list1);

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		numbers.removeIf(num -> num % 2 == 0);
		System.out.println(numbers);

		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Naveen", "Tom", "Naveen", "Steave", "Lisa"));

		System.out.println(nameList);

		nameList.retainAll(Collections.singleton("Tom"));
		System.out.println(nameList);
	}
}
