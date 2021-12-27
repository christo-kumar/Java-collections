package com.learnandfun.collection.raw.hash;

/***
 * 
 * @author christokumar SEQUENCE OF OPERATION Set up the hash table Its a array
 *         linked list. Insert put, get
 */

public class HashTable {

	// Array of LinkedList
	private HashLinkedList[] hashTable;
	private int initialCapacity;

	public HashTable() {
		initialCapacity = 15;
		hashTable = new HashLinkedList[initialCapacity];
	}

	public void add(String key, String value) {
		HashNode newNode = new HashNode(key, value);
		int index = calculateHash(key);
		HashLinkedList hashList = hashTable[index];
		if (hashList != null) {
			hashList.add(newNode);
		} else {
			HashLinkedList list = new HashLinkedList();
			list.add(newNode);
			hashTable[index] = list;
		}
	}

	public String value(String key) {
		int index = calculateHash(key);
		HashLinkedList hashList = hashTable[index];
		if (hashList != null) {
			HashNode node = searchNode(hashList.head, key);
			return node.value;
		}
		return null;
	}

	public HashNode searchNode(HashNode node, String key) {
		while (node != null) {
			if (node.key == key) {
				return node;
			}
			searchNode(node, key);
		}
		return null;
	}

	private int calculateHash(String key) {
		return 0;
	}
}
