package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 2, 3, 1, 4, 5, 6, 1, 7, 8, 9, 7));

		// 1. LinkedHashSet
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(number);
		ArrayList<Integer> numberListWithoutDup = new ArrayList<Integer>(linkedHashSet);
		System.out.println(numberListWithoutDup);
		System.out.println("===============");
		// JDK8
		List<Integer> l = number.stream().distinct().collect(Collectors.toList());
		l.forEach(o -> System.out.print(o));
	}
}
