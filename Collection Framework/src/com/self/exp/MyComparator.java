package com.self.exp;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {

		String i1 = obj1.toString();
		String i2 = obj2.toString();
		if (i1.length() > i2.length()) {
			return 1;
		} else if (i1.length() < i2.length()) {
			return -1;
		} else {

			return i1.compareTo(i2);
		}
	}

}
