package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		int[] a = new int[6];
		a[0] = 10;
		a[1] = 11;
		a[2] = 12;
		
		System.out.println(a[2]);
		System.out.println(a.length);
		//System.out.println(a[a.length]);
		if(a.length-1>=4) {
		int x = a[4];
		System.out.println("-------");
		}
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add(200);
		ar.add("testing");
		ar.add('t');
		ar.add(12.33);
		ar.add(true);
		System.out.println(ar);
		System.out.println(ar.get(2));
		System.out.println(ar.size());
		System.out.println("LI = " + 0);
		System.out.println("HI = " + (ar.size() - 1));
		ar.add(400);
		ar.add(500);
		//ar.get(8);

		System.out.println(ar.size());
		System.out.println();
	}
}
