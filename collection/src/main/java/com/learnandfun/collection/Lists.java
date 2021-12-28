package com.learnandfun.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lists
{
	public void arrayList() {
		List<String> names = new ArrayList<>();
		names.add("Christo");
		names.add("Abhinav");

		Iterator itr = names.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

	public void linkedList() {
		List<String> names = new LinkedList<>();
		names.add("Christo");
		for (String name : names) {
			System.out.print(name);
		}
	}

}
