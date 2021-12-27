package com.learnandfun.collection;


import com.learnandfun.collection.raw.linkedlist.LinkedList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LinkedListTest extends TestCase {

	private LinkedList linkedList;

	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public LinkedListTest(String testName) {
		super(testName);
		linkedList = new LinkedList();
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
		testAddLast();
	}

	public void testAddLast() {
		// linkedList.addFront(1);
		// linkedList.add(5);
		// linkedList.add(6);
		// assertEquals(linkedList.getLast().getValue(), 6);

	}

}
