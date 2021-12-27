package com.learnandfun.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Algorithm {

	public Boolean isUniqueString(String originalStr) {
		Boolean[] boolArray = new Boolean[128];
		char[] chrArray = originalStr.toCharArray();
		for (char chr : chrArray) {
			// original.textAt(index); //Can also be used.
			Boolean boolVal = boolArray[chr];
			if (boolVal) {
				return false;
			}
		}
		return true;
	}

	public String sortString(String thisStr) {
		char[] charArray = thisStr.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}

	public Boolean isPermutation(String thisStr, String thatStr) {
		if (thisStr.length() != thatStr.length())
			return false;
		String sortThis = sortString(thisStr);
		String sortThat = sortString(thatStr);
		if (sortThis.equalsIgnoreCase(sortThat))
			return true;
		return false;
	}

	public String urlifyString(String thisStr) {
		String thatStr = thisStr.replaceAll(" ", "%20");
		return thatStr;
	}

	public Boolean isOneAway(String param1, String param2) {
		String thisStr = "";
		String thatStr = "";
		Boolean checkForAdd = true;

		if (param1.length() > param2.length()) {
			thisStr = param1;
			thatStr = param2;
		} else {
			thisStr = param2;
			thatStr = param1;
		}
		// One Add Away
		// One Delete Away
		if (thisStr.length() - thatStr.length() > 1) {
			return false;
		} else if (thisStr.length() - thatStr.length() == 0) {
			checkForAdd = false;
		}

		char[] thisArr = thisStr.toCharArray();
		char[] thatArr = thatStr.toCharArray();

		HashMap<Character, Integer> thisMap = new HashMap<>();
		for (char chr : thisArr) {
			Integer val = thisMap.get(chr);
			if (val == null)
				val = 0;
			thisMap.put(chr, ++val);
		}
		HashMap<Character, Integer> thatMap = new HashMap<>();
		for (char chr : thatArr) {
			Integer val = thatMap.get(chr);
			if (val == null)
				val = 0;
			thatMap.put(chr, ++val);
		}

		int diff = 0;
		for (char key : thisMap.keySet()) {
			Integer thisVal = thisMap.get(key);
			Integer thatVal = thatMap.get(key);
			if (thisVal != thatVal) {
				diff++;
			}
		}

		if (checkForAdd && diff <= 1)
			return true;
		if (!checkForAdd && diff <= 2)
			return true;

		return false;
	}

	public String compressString(String thisStr) {
		char[] thisArr = thisStr.toCharArray();
		HashMap<Character, Integer> thisMap = new HashMap<>();
		for (char chr : thisArr) {
			Integer val = thisMap.get(chr);
			if (val == null)
				val = 0;
			thisMap.put(chr, ++val);
		}
		String str = "";
		for (char key : thisMap.keySet()) {
			String strKey = String.valueOf(key);
			String strVal = String.valueOf(thisMap.get(key));
			str = str + strKey + strVal;
		}
		return str;
	}

	public String removeDuplicate(String thisStr) {
		char[] charArray = thisStr.toCharArray();
		LinkedHashSet<Character> charSet = new LinkedHashSet<>();
		for (char chr : charArray) {
			charSet.add(chr);
		}
		return charSet.toString();
	}

	public void checkSubTree() {
		//To do
		TreeSet<Integer> ts1 = new TreeSet<>();
		TreeSet<Integer> ts2 = new TreeSet<>();
		ts1.add(1);
		ts1.add(3);
		ts1.add(5);
		ts2.add(3);
		ts2.add(5);
		String thisStr = ts1.toString();
		String thatStr = ts2.toString();
		thisStr.contains(thatStr);
		// Get two binary tree.
		// tree.getOrder(); sorted Strings
		// string to contain another.
	}
	
	public void pathWithSum() {
		//To do
	}
	
	public String revStr(String thisStr) {
		char[] charArray = thisStr.toCharArray();
		int arrSize = charArray.length - 1;
		int midIndex = charArray.length / 2;
		for (int index = 0; index < midIndex; index++) {
			char temp = charArray[index];
			charArray[index] = charArray[arrSize-index];
			charArray[arrSize - index] = temp;
		}
		return new String(charArray);
	}
	
	public Boolean isPalindrom(String thisStr) {
		String thisRevStr = revStr(thisStr);
		if (thisStr.equalsIgnoreCase(thisRevStr))
			return true;
		return false;
	}

	public void fizbuzz() {
		for (int index = 0; index <= 100; index++) {
			if (index % 3 == 0 && index % 5 == 0) {
				System.out.println("fizz-buzz");
			} else if (index % 3 == 0) {
				System.out.println("fizz");
			} else if (index % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(index);
			}
		}
	}

	public void ransomeNote() {
		// Todo
	}

	public String cipherDemo(String thisStr) {
		char[] chrArray = thisStr.toCharArray();
		for (int index = 0; index < chrArray.length; index++) {
			int intChr = chrArray[index];
			intChr = intChr + 3;
			if (intChr > 128) {
				int diff = intChr - 128;
				intChr = diff - 1;
			}
			chrArray[index] = (char) intChr;
		}
		return new String(chrArray);
	}

	public int[] sieveOfEratosthenes(int index) {
		// Keep on removing multiples of numbers
		return null;
	}

	public Integer reverseInt(int number) {
		String thisStr = String.valueOf(number);
		String revStr = revStr(thisStr);
		return Integer.valueOf(revStr);
	}

	public Boolean isAnagram(String thisStr, String thatStr) {
		return false;
	}
}
