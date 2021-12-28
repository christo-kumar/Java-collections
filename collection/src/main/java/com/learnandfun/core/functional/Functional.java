package com.learnandfun.core.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Functional {

	public void iteration(ArrayList<String> fruits) {
		fruits.stream().forEach(fruit -> System.out.println(fruit));
	}

	// Intermediate
	public void filter(ArrayList<String> fruits) {
		fruits.stream().filter(fruit -> fruit.startsWith("A")).forEach(fruit -> {
			System.out.print(fruit);
		});
	}

	// Adding all values in Array
	// Reduce - Terminal
	public void addAll(ArrayList<Integer> numbers) {
		Integer sum = numbers.stream().reduce(0, (param1, param2) -> {
			return param1 + param2;
		});
		System.out.print(sum);
	}

	// Sort - Intermediate
	// Collecting Intermediate Operation
	public void sort(ArrayList<Integer> numbers) {
		List<Integer> arr = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(arr.toString());

	}

	public void distinct(ArrayList<Integer> numbers) {
		numbers.stream().distinct().forEach(param -> System.out.print(param));
	}

	public void map(ArrayList<Integer> numbers) {
		List<Integer> arr = numbers.stream().map(param -> param * param).collect(Collectors.toList());
		System.out.println(arr.toString());
	}

}
