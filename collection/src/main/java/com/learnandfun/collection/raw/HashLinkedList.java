package com.learnandfun.collection.raw;

public class HashLinkedList {
	public HashNode head;
	public int size;

	public HashLinkedList() {
		head = null;
		size = 0;
	}

	public void add(HashNode node) {
		if (head == null) {
			head = node;
		} else {
			HashNode last = getLast(head);
			last.next = node;
		}
	}

	private HashNode getLast(HashNode node) {
		while (node.next != null) {
			getLast(node.next);
		}
		return node;
	}

	public String peek(HashNode node) {
		return node.key;
	}

}
