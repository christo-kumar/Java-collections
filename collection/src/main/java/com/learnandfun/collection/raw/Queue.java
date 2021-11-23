package com.learnandfun.collection.raw;

public class Queue {

	private DequeNode first;
	private DequeNode last;

	public Queue() {
		first = null;
		last = null;
	}

	public void push(int number) {
		DequeNode newNode = new DequeNode(number);
		if (first == null && last == null) {
			first = newNode;
			last = newNode;
		}
		newNode.setNext(last);
		last.setPrev(newNode);
		last = newNode;

	}

	public int pop() throws Exception {
		if (first != null) {
			int retval = first.getData();
			DequeNode second = first.getPrev();
			second.setNext(null);
			first = second;
			return retval;
		}

		throw new Exception("Empty Queue");
	}

}
