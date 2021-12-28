package com.learnandfun.algorithm;

public class AlgorithmSorting {

	// Bubbles the number
	// O(n^2)
	public int[] bubbleSort(int[] thisArray) { // 4
		for (int outer = 0; outer < thisArray.length - 1; outer++) { // 3-->2--->1
			for (int inner = 0; inner < (thisArray.length - 1) - outer; inner++) { // 4-3 1
				// outer - 0, [3]
				// outer - 1, [2]
				// outer - 2, [1]
				if (thisArray[inner] > thisArray[inner + 1]) {
					int temp = thisArray[inner];
					thisArray[inner] = thisArray[inner + 1];
					thisArray[inner + 1] = temp;
				}
			}
		}
		printArray(thisArray);
		return thisArray;
	}

	private void printArray(int[] thisArray) {
		for (int outer = 0; outer < thisArray.length; outer++) {
			System.out.print(thisArray[outer]);
		}
	}

	// O(nLogn)
	public int[] mergeSort(int[] thisArray) {
		// combine sorted Array
		return null;
	}

	private void mSort(int arr[], int left, int right) {
		if (left < right) {
			int middle = left + right / 2;
			mSort(arr, left, middle);
			mSort(arr, middle + 1, right);

			mMerge(arr, left, middle, right);
		}
	}


	private void mMerge(int[] arr, int left, int middle, int right) {
		// TODO
	}

	// O(nLogn)
	public void quickSort() {
		// TODO
	}

}
