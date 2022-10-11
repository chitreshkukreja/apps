package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> studentList = new ArrayList<>();
		studentList.add("Tom");
		studentList.add("Naveen");
		studentList.add("Steave");
		studentList.add("Liza");

		// typical for looop;
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}

		System.out.println("----------");

		for (String s : studentList) {
			System.out.println(s);
		}

		System.out.println("------------");

		// jdk8
		studentList.stream().forEach(s -> System.out.println(s));

		System.out.println("------------");
		Iterator<String> it = studentList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
