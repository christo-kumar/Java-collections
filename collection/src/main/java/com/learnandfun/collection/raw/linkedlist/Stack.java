package com.learnandfun.collection.raw.linkedlist;

//1. Create Node
//2. Class Stack top and size
//3. Constuctor
//4. Getters and Setters
//5. push

public class Stack {

	private Node top;
	private int size = 0;

	public Stack() {
		top = null;
		size = 0;
	}

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

	public void push(int number) {
		Node newNode = new Node(number);
		if (top == null) {
			top = newNode;
		} else {
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
