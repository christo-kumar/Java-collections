package com.learnandfun.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

	public void priorityQueues() {
		Queue<String> queue = new PriorityQueue<>(/* getCompartor() */);
				queue.poll();//output: null
				ArrayList<String> arr = new ArrayList<>();
				arr.add("Bat");
				arr.add("Cat");
				queue.addAll(arr);
				System.out.println(queue.toString());// Output:
				queue.poll();// Output: BAT FIFO
				System.out.println(queue.toString());//
	}

	public LengthComparator getCompartor() {
		return new LengthComparator();
	}
}

//Defining Comparator for Priority Queue
class LengthComparator implements Comparator<String> {
	public int compare(String thisStr, String thatStr) {
		return Integer.compare(thisStr.length(), thatStr.length());
	}
}
