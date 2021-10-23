package com.learnandfun.collection.raw;

public class LinkedList {

	private Node head;
	private int size = 0;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}

		@SuppressWarnings("unused")
		public int getValue() {
			return data;
		}
	}

	public void addFront(int number) {
		Node newNode = new Node(number);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void addLast(int number) {
		Node lastNode = getLast();
		Node newNode = new Node(number);
		lastNode.next = newNode;
		size++;
	}

	public void remove() {

	}

	public int size() {
		if ()
	}

	public Node trav(Node node) {
		return node.next;
	}

	public Node getFirst() {
		return head;
	}

	public Node getLast(Node node) {
		if (node.next == null) {
			return node;
		} else {
			return getLast(trav(node));
		}
	}

	public Node getLast() {
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}

		return current;
	}
}
