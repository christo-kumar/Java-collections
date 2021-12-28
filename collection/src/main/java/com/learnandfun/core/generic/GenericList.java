package com.learnandfun.core.generic;

import java.util.ArrayList;

public class GenericList<T> {

	ArrayList<T> list = new ArrayList<>();

	public void addElement(T element) {
		list.add(element);
	}

	public T getElement(int index) {
		return list.get(index);
	}

	public <X> X deomGenericFunction(X param) {
		return param;
	}
	
	public void demoWildCard(ArrayList<? extends Number> param) {
		for (Number num : param) {
			System.out.print(num);
		}
	}


}
