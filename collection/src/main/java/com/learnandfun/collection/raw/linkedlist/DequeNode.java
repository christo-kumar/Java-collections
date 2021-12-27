package com.learnandfun.collection.raw.linkedlist;

public class DequeNode {
	private int data;
	private DequeNode next;
	private DequeNode prev;

	public DequeNode() {
		next = null;
		prev = null;
	}

	public DequeNode(int data) {
		this.data = data;
		next = null;
		prev = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DequeNode getNext() {
		return next;
	}

	public void setNext(DequeNode next) {
		this.next = next;
	}

	public DequeNode getPrev() {
		return prev;
	}

	public void setPrev(DequeNode prev) {
		this.prev = prev;
	}


}
