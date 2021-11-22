package com.learnandfun.application;

import com.learnandfun.collection.JavaList;
import com.learnandfun.collection.raw.DynamicArray;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		simpleArray();
		dynamicArray();
		linkedList();
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

	public static void linkedList() {
		JavaList collection = new JavaList();
		collection.arrayList();
	}
}
