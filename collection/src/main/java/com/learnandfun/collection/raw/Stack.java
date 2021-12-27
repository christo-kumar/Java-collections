package com.learnandfun.collection.raw;

public class Stack {

	private Node top;
	private int size = 0;

	public Node getTop() {
		return top;
	}

	public void setTop(Node top) {
		this.top = top;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Stack() {
		top = null;
		size = 0;
	}

	public void push(int number) {
		Node newNode = new Node(number);
		if (top == null) {
			top = newNode;
			top.setMin(newNode.getData());
		} else {
			if (newNode.getData() < top.getMin()) {
				newNode.setMin(newNode.getData());
			} else {
				newNode.setMin(top.getMin());
			}
			newNode.setNext(top);
			top = newNode;

		}
		size++;
	}

	public int pop() throws Exception {
		if (top != null) {
			Node temp = top;
			top = top.getNext();
			int retval = temp.getData();
			temp = null;
			return retval;
		}
		throw new Exception("Stack is empty");
	}

	public int peek() throws Exception {
		if (top != null) {
			return top.getData();
		}
		throw new Exception("Stack is empty");
	}
}
