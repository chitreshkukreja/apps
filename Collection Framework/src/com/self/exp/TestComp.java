package com.self.exp;

import java.util.TreeMap;

public class TestComp {

	public static void main(String[] args) {

//		TreeSet t=new TreeSet(new MyComparator());
//		
//		t.add(10);
//		t.add(0);
//		t.add(15);
//		t.add(5);
//		t.add(20);
//		//t.add("chitresh");
//		System.out.println(t);

//		TreeSet t=new TreeSet(new MyComparator());
//		t.add("Roja");
//		t.add("ShobaRani");
//		t.add("RajaKumari");
//		t.add("GangaBhavani");
//		t.add("Ramulamma");

//		t.add(new StringBuffer("A"));
//		t.add(new StringBuffer("Z"));
//		t.add(new StringBuffer("K"));
//		t.add(new StringBuffer("L"));
//		System.out.println(t);

//		TreeSet t=new TreeSet(new MyComparator());
//		t.add("A");
//		t.add(new StringBuffer("ABC"));
//		t.add(new StringBuffer("AA"));
//		t.add("xx");
//		t.add("ABCD");
//		t.add("A");
//		System.out.println(t);

//		HashMap m = new HashMap();
//		m.put("chiranjeevi", 700);
//		m.put("balaiah", 800);
//		m.put("venkatesh", 200);
//		m.put("nagarjuna", 500);
//
//		System.out.println(m);
//		Set s1 = m.entrySet();
//		System.out.println(s1);
//		Iterator itr = s1.iterator();
//		while (itr.hasNext()) {
//			Map.Entry m1 = (Map.Entry) itr.next();
//			System.out.println(m1.getKey() + "......" + m1.getValue());
//		}
		
//		HashMap m=new HashMap();
//		Integer i1=new Integer(10);
//		Integer i2=new Integer(10);
//		m.put(i1,"pavan");
//		m.put(i2,"kalyan");
//		System.out.println(m);
		
		TreeMap t=new TreeMap();
		t.put(100,"ZZZ");
		t.put(103,"YYY");
		t.put(101,"XXX");
		t.put(104,106);
		t.put(107,null);
		
		System.out.println(t);
		
	}

}
