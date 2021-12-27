package com.learnandfun.collection.raw.tree;

/***
 * 
 * @author christokumar
 * SEQUENCE OF OPERATION
 * INSERT
 * SEARCH
 * SEARCH MIN
 * DELETE - NoChild, One Child, Two Child
 */

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

	public void delete(int value) {

		BinaryNode node = find(value);
		int childCount = 0;
		if (node.left != null)
			childCount++;
		if (node.right != null)
			childCount++;
		if (childCount == 0) {
			node = null;
		}

		if (childCount == 1) {
			if (node.right != null) {
				node.value = node.right.value;
				node.right = null;
			}

			if (node.left != null) {
				node.value = node.left.value;
				node.left = null;
			}
		}

		if (childCount == 2) {
			BinaryNode minRightNode = findMin(node);
			node.value = minRightNode.value;
			// This is wrong. Please correct it
			minRightNode = null;
		}
	}

	public BinaryNode find(int value) {
		return find(value, root);
	}

	public BinaryNode findMin(BinaryNode node) {
		if (node.left == null) {
			return node;
		}
		return findMin(node.left);
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

	/***
	 * DEPTH FIRST TRAVESING In-order L Root R Pre-Order Root L R - Helps in Sorting
	 * Post Order L R Root -
	 * 
	 */

	public void inOrder(BinaryNode node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.value);
			inOrder(node.right);
		}
	}

	public void preOrder(BinaryNode node) {
		if (node != null) {
			System.out.print(node.value);
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	public void postOrder(BinaryNode node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.value);
		}
	}
}
