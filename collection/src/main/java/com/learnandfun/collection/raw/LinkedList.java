package com.learnandfun.collection.raw;

public class LinkedList {

	private Node head;

	private static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void addFront(int number) {
		Node newNode = new Node(number);
		newNode.next = head;
		head = newNode;
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
