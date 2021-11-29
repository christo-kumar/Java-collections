package com.learnandfun.application;

import com.learnandfun.collection.JavaList;
import com.learnandfun.collection.raw.BinaryHeap;
import com.learnandfun.collection.raw.BinaryTree;
import com.learnandfun.collection.raw.DynamicArray;
import com.learnandfun.collection.raw.Graph;
import com.learnandfun.collection.raw.HashTable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		// simpleArray();
		// dynamicArray();
		// javaCollection();
		// javaHashTable();
		// javaBinaryTree();
		// javaBinaryHeap();
		javaGraph();
	}

	private static void javaGraph() {
		Graph graph = new Graph(4);
		graph.addEdge(0, 0);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(2, 3);
		graph.BFS();
		graph.DFS();


	}

	public static void simpleArray() {
		int[] myArray = new int[10];
		for (int value : myArray) {
			System.out.print(value);
		}
	}

	public static void dynamicArray() {
		DynamicArray dynamic = new DynamicArray(10);
		dynamic.insert(0, "test");
		dynamic.insert(1, "test");

		for (int i = 0; i <= dynamic.getSize(); i++) {
			System.out.print(dynamic.get(i));
		}

    }

	public static void javaCollection() {
		JavaList collection = new JavaList();
		collection.arrayList();
	}

	public static void javaHashTable() {
		HashTable hashTable = new HashTable();
		hashTable.add("name", "christo");
		String value = hashTable.value("name");
		System.out.print(value);
	}

	public static void javaBinaryTree() {
		BinaryTree tree = new BinaryTree();
		try {
			tree.insert(5);
			tree.insert(4);
			tree.insert(6);
			tree.insert(2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void javaBinaryHeap() {
		BinaryHeap binHeap = new BinaryHeap();
		binHeap.insert(10);
		binHeap.insert(11);
		int max = binHeap.getMax();
		System.out.print(max);
		binHeap.insert(12);
		max = binHeap.getMax();
		System.out.print(max);
		binHeap.insert(13);
		max = binHeap.getMax();
		System.out.print(max);
		binHeap.insert(9);
		max = binHeap.getMax();
		System.out.print(max);
		binHeap.insert(15);
		max = binHeap.getMax();
		System.out.print(max);

	}

}
