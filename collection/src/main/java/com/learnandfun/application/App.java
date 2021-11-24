package com.learnandfun.application;

import com.learnandfun.collection.JavaList;
import com.learnandfun.collection.raw.BinaryTree;
import com.learnandfun.collection.raw.DynamicArray;
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
		javaBinaryTree();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
