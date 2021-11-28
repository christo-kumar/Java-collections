package com.learnandfun.collection.raw;

/***
 * 
 * @author christokumar
 *
 * @param <String>
 * 
 *                 Setup the DS with array, size and initial capacity Set
 *                 Operation Get Operation Insert Operation, Resize operation
 *                 Delete
 * 
 */

public class DynamicArray<String> {
	private Object[] data;
	private int size;
	private int initialCapacity;

	public DynamicArray(int initialCapacity) {
		this.initialCapacity = initialCapacity;
		data = new Object[initialCapacity];
		size = 0;
	}

	// O(1)
	public String get(int index) {
		return (String) data[index];
	}

	public void set(int index, String value) {
		data[index] = value;
	}

	public void insert(int index, String value) {

		if (index == initialCapacity) {
			resize();
		}

		// Copy Up
		for (int j = size; j > index; j--) {
			data[j] = data[j - 1];
		}

		// actual insert
		data[index] = value;
		size++;

	}

	public void removeAt(int index) {
		for (int j = index; j < 0; j++) {
			data[index] = data[j + 1];
		}
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	public void add(String value) {
		if (size == initialCapacity) {
			resize();
		}
		data[size] = value;
		size++;
	}

	public void remove() {
		if (size > 0) {
			data[size] = null;
			size--;
		}
	}

	private void resize() {
		Object[] newData = new Object[initialCapacity * 2];
		for (int i = 0; i < initialCapacity; i++) {
			newData[i] = data[i];
		}
		data = newData;
		initialCapacity = initialCapacity * 2;
	}

}
