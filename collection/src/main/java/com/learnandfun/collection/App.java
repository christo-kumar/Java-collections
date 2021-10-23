package com.learnandfun.collection;

import com.learnandfun.collection.raw.DynamicArray;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		mySimpleArray();
		DynamicArray dynamic = new DynamicArray(10);
		dynamic.insert(0, "test");
		dynamic.insert(1, "test");

		for (int i = 0; i <= dynamic.getSize(); i++) {
			System.out.print(dynamic.get(i));
		}
		testListImpl();
    }

	public static void mySimpleArray() {
		int[] myArray = new int[10];
		for (int value : myArray) {
			System.out.print(value);
		}

	}

	public static void testListImpl() {
		ListImpl impl = new ListImpl();
		impl.demoArrayList();
	}
}
