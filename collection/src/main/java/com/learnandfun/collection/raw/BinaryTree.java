package com.learnandfun.collection.raw;

public class BinaryTree {

	BinaryNode root;

	public BinaryTree() {
		root = null;
	}

	public void insert(int value) throws Exception {
		insert(value, root);
	}

	private void insert(int value, BinaryNode node) throws Exception {

		if (root == null) {
			root = new BinaryNode(value);
			return;
		}

		if (value > node.value) {
			if (node.right == null) {
				node.right = new BinaryNode(value);
			} else {
				insert(value, node.right);
			}

		} else if (value < node.value) {
			if (node.left == null) {
				node.left = new BinaryNode(value);
			} else {
				insert(value, node.left);
			}

		} else if (value == node.value) {
			throw new Exception("Value already avaliable");
		}
	}

	public BinaryNode find(int value) {
		return find(value, root);
	}

	private BinaryNode find(int value, BinaryNode node) {
		if (value > node.value && node.right != null) {
			find(value, node.right);
		} else if (value < node.value && node.left != null) {
			find(value, node.left);
		} else if (value == node.value) {
			return node;
		}
		return null;
	}
}
