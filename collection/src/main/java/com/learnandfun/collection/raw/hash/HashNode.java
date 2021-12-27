package com.learnandfun.collection.raw.hash;

public class HashNode {
	public String key;
	public String value;
	public HashNode next;

	HashNode(String key, String value) {
		this.key = key;
		this.value = value;
		next = null;
	}
}
