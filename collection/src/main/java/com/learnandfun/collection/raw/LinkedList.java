package com.learnandfun.collection.raw;

public class LinkedList {

	private Node head = null;
	private Node tail = null;
	private int size = 0;

	public static class Node {
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
		size++;
	}

	public void add(int number) {
		Node lastNode = getLast();
		Node newNode = new Node(number);
		if (lastNode == null) {
			head = newNode;
		} else {
			lastNode.next = newNode;
		}
		size++;
	}

	public void remove() {
		Node lastNode = getLast();
		lastNode = null;
	}

	public void removeByValue(int value) {
		Node searchedNode = search(value);
		if (searchedNode == null) {
			// do nothing
		} else if (searchedNode.data == value) {
			// first Node is equal
			head = searchedNode.next;
			searchedNode = null;

		} else if (searchedNode.next.data == value) {
			// other node not first
			Node nodeToBeDeleted = searchedNode.next;
			Node nodeTobeLinked = nodeToBeDeleted.next;
			searchedNode.next = nodeTobeLinked;
			nodeToBeDeleted = null;
		}
	}

	public Node search(int value) {
		Node current = head;
		if (head == null || (head.data == value)) {
			return head;
		} else {
			do {
				if (current.next.data == value) {
					break;
				}
			} while (current.next != null);
		}
		return current;
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
		if (current == null) {
			return null;
		}
		while (current.next != null) {
			current = current.next;
		}

		return current;
	}

	public int size() {
		int size = 0;
		Node current = head;
		if (current == null) {
			return size;
		} else {
			while (current.next != null) {
				current = current.next;
				size++;
			}
		}
		return size;
	}

	public void clear() {
		if (head == null) {
			return;
		} else {
			while (head.next != null) {
				Node prevHead = head;
				head = head.next;
				prevHead = null;
			}
		}
	}

	// *************** Implementation for Stack ********************

	// add on head and remove on head
	public void pushForStack(Node node) {
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	// add on head and remove on head
	public void popForStack() {
		if (head.next != null) {
			Node temp = head;
			head = head.next;
			temp = null;
		}
	}

	// *************** Implementation for Stack ********************

	// add on head remove from tail
	public void pushForQueue(Node node) {
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	private void setTail() {
		tail = getLast();
	}

	// add on head remove from tail
	public void popForQueue() {
		setTail();
		tail = null;
	}

}
