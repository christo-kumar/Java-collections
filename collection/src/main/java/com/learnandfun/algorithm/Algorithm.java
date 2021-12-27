package com.learnandfun.algorithm;

import java.util.Arrays;
import java.util.HashMap;

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
}
