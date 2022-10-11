package navnne.automation;

import java.util.Arrays;
import java.util.BitSet;

public class printNumber {

	public static void main(String[] args) {

		// 1.Arrays fill:
		Object num[] = new Object[100];
		System.out.println("------------");
		Arrays.fill(num, new Object() {

			int count = 0;

			@Override
			public String toString() {
				System.out.println("#### " + count);
				return Integer.toString(++count);
			}
		});
		System.out.println(Arrays.toString(num));

		System.out.println("---------------------");

		// bitset
		String set = new BitSet() {
			{
				set(1, 101);
			}
		}.toString();
		System.out.append(set, 1, set.length());
	}

}
