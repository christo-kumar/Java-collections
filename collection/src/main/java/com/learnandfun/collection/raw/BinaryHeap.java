package com.learnandfun.collection.raw;

public class BinaryHeap {

	private int[] dataSet;
	private int initialCapacity;
	private int size;

	public BinaryHeap() {
		initialCapacity = 10;
		size = 0;
		dataSet = new int[initialCapacity];
	}

	public void insert(int value) {
		if (size < initialCapacity) {
			dataSet[size] = value;
			size++;
			heapify(size - 1);
		}
	}

	public void heapify(int childIndex) {
		for (int currentIndex = childIndex; currentIndex > 0; currentIndex--) {
			int parentIndex = (currentIndex - 1) / 2;
			heapify(parentIndex, currentIndex);
		}
	}


	public void heapify(int parentIndex, int childIndex) {
		int parentValue = dataSet[parentIndex];
		int childValue = dataSet[childIndex];
		if (childValue > parentValue) {
			dataSet[childIndex] = parentValue;
			dataSet[parentIndex] = childValue;
		}
	}

	public int getMax() {
		return dataSet[0];
	}

}
