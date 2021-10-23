package com.learnandfun.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListImpl {

	public void demoArrayList() {
		List<String> names = new ArrayList<>();
		names.add("Christo");
		names.add("Abhinav");

		Iterator itr = names.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

	public void demoLinkedList() {
		List<String> names = new LinkedList<>();
		names.add("Christo");
		for (String name : names) {
			System.out.print(name);
		}
	}

}
