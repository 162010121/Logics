package com.test.logics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Alti {

	public static void main(String[] args) {

		// To Find The Duplicates Number
//		List<Integer> list = new ArrayList<>();
//		Collections.addAll(list, 1, 3, 5, 7, 3, 4, 5);
//		Set<Integer> set = new HashSet<>();
//		List<Integer> result = list.stream().filter(num -> !set.add(num)).collect(Collectors.toList());
//		System.out.println("With Duplicate " + list);
//		System.out.println("WithOut Duplicates" + result);
		
		List<String> list = new ArrayList<>();
		Collections.addAll(list,"P","P","R","M","M");
		Set<String> set = new HashSet<>();
		List<String> result = list.stream().filter(num -> !set.add(num)).collect(Collectors.toList());
		System.out.println("With Duplicate " + list);
		System.out.println("WithOut Duplicates" + result);

		// To check the two arrays equal or not
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2, 3, 4 };
		boolean isEqual = Arrays.equals(arr1, arr2);
		if (isEqual) {
			System.out.println("The two arrays are equal.");
		} else {
			System.out.println("The two arrays are not equal.");
		}

		
		
		Integer a[] = { 50, 35, 10, -25, 90, -35, 85 };

		System.out.println("Second Smallet" + secondSmallest(a, 7));

	}

	public static int secondSmallest(Integer[] a, int total) {
		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		int element = list.get(5);
		return element;

	}

}
