package com.learnandfun.collection.raw.linkedlist;

//Sequence of operation

//1. trav()
//2. getLast()
//3. add()
//4. remove() removes last
//5. search(int)
//6. removeByValue
//7. Clear

//Get First, Get Last
//Add Back
//Size
//Clear
//Delete with value


public class LinkedList {

	private Node head = null;
	private Node tail = null;
	private int size = 0;

	public Node trav(Node node) {
		return node.next;
	}

	public Node getLast(Node node) {
		if (node.next == null) {
			return node;
		} else {
			return getLast(trav(node));
		}
	}

	public void add(int number) {
		Node lastNode = getLast(head);
		Node newNode = new Node(number);
		if (lastNode == null) {
			head = newNode;
		} else {
			lastNode.next = newNode;
		}
		size++;
	}

	public void remove() {
		Node lastNode = getLast(head);
		lastNode = null;
	}

	public Node search(int value) {
		return search(value, head);
	}

	private Node search(int value, Node current) {
		if (value == head.data)
			return head;
		if (value == current.next.data)
			return current;
		if (current.next == null)
			return null;
		return search(value, current.next);

	}

	public void removeByValue(int value) {
		Node searchedNode = search(value); // returns previous node
		if (searchedNode == null) {
			// do nothing
		} else if (searchedNode.data == value) {
			// first Node is equal
			head = searchedNode.next;
			searchedNode = null;

		} else if (searchedNode.data == value) {
			// other node not first
			Node nodeToBeDeleted = searchedNode.next;
			Node nodeTobeLinked = nodeToBeDeleted.next;
			searchedNode.next = nodeTobeLinked;
			nodeToBeDeleted = null;
		}
	}



	public Node getFirst() {
		return head;
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
		tail = getLast(head);
	}

	// add on head remove from tail
	public void popForQueue() {
		setTail();
		tail = null;
	}

}
