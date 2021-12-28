package com.learnandfun.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	void mapsOfDemo() {
//		Map<String, Integer> map = Map.of("A", 2, "B", 3);
//		map.get("A");// Output: 2
//		map.get("D");// Output: null
//		map.size();// Output: 2
//		map.containsKey("A");// true
//		map.keySet();// [B, A]
//		map.values();// [2,3]
	}

	// Unordered UnSorted
	// HashTable underlying DS
	// HashMap allows keys can have null value
	// HashTable is thread Safe not HashMap
	void hashMap() {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("A", 2);
		hashMap.put("F", 5); // returns previous value null in this case
		hashMap.put("A", 6); // returns 2
		hashMap.get("A");// Output: 2
		hashMap.size();
		hashMap.containsKey("A");
		hashMap.keySet();
		hashMap.values();
	}

	// Ordered and UnSorted
	void linkedHashMap() {
		Map<String, Integer> linkHashMap = new LinkedHashMap<>();
		linkHashMap.put("F", 5); // returns previous value null in this case
		linkHashMap.put("A", 6);
		System.out.println(linkHashMap.toString());// F, A maintains order
	}

	// Ordered and Sorted
	void treeMap() {
		TreeMap<String, Integer> treeHashMap = new TreeMap<>();
		treeHashMap.put("F", 15); // returns previous value null in this case
		treeHashMap.put("A", 7);
		System.out.println(treeHashMap.toString());// A, F Sorted acending
		treeHashMap.higherKey("A"); // F
		treeHashMap.ceilingKey("A"); // A
		treeHashMap.firstEntry();// A
		treeHashMap.lastEntry();// F
		treeHashMap.subMap("C", "E");

	}

}
