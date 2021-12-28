package com.learnandfun.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	// Unique unordered and UnSorted
	public void hashSet() {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Apple");// return: true
		hashSet.add("Apple");// returns: false
		Iterator<String> itr = hashSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	// Unique Ordered and UnSorted
	public void linkedSet() {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(1);
		linkedHashSet.add(1); // returns: false
		linkedHashSet.add(2); // output: 1 2
		// Iteration remains same as above
		// For indexing convert it to arraylit
		// Convert LinkedHashSet to ArrayList
		ArrayList<Integer> elements = new ArrayList<>(linkedHashSet);
		elements.get(0);
	}

	// Unique, Ordered and Sorted
	public void treeSet() {
		Set<Integer> treeHashSet = new TreeSet<>();
		treeHashSet.add(2);
		treeHashSet.add(1);
		treeHashSet.add(1); // returns: false
		treeHashSet.add(3); // output : 1,2,3

		// String to ArrayList
//		String str = "Hello worlds";
//		char[] chrs = str.toCharArray();
//		Character[] charObjectArray = ArrayUtils.toObject(chrs);
//		List<char[]> characters = Arrays.asList(chrs);
//
//		// ArrayList to TreeSet
//		TreeSet<char[]> treeCharacter = new TreeSet<>(characters);
//		// unique and sorted
//		System.out.prinln(treeCharacter);
	}

	public void treeSet2() {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(33);
		numbers.add(40);
		numbers.add(90); // returns: false
		numbers.add(55); // output : 1,2,3
		numbers.floor(50);// Output: 40
		numbers.floor(40);// Output: 40
		numbers.lower(40);// Output: 33
		numbers.ceiling(50); // Output: 55
		numbers.ceiling(55); // Output: 55
		numbers.higher(55); // Output: 90
		numbers.subSet(30, 60); // Output: 33, 40, 55 lower limit inclusive
		numbers.subSet(30, true, 60, true); // Both limits are inclusive
		numbers.headSet(50); // Output: 33, 40
		numbers.tailSet(50); // Output: 40, 55
	}


}
